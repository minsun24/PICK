package com.nob.pick.project.command.application.service;

import com.nob.pick.project.command.application.dto.ProjectReviewDTO;
import com.nob.pick.project.command.domain.aggregate.entity.MemberReview;
import com.nob.pick.project.command.domain.aggregate.entity.Participant;
import com.nob.pick.project.command.domain.aggregate.entity.ProjectReview;
import com.nob.pick.project.command.domain.aggregate.entity.ProjectRoom;
import com.nob.pick.project.command.domain.repository.MemberReviewRepository;
import com.nob.pick.project.command.domain.repository.ParticipantRepository;
import com.nob.pick.project.command.domain.repository.ProjectReviewRepository;
import com.nob.pick.project.command.domain.repository.ProjectRoomRepository;
import com.nob.pick.project.command.application.dto.MemberReviewDTO;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.nio.file.AccessDeniedException;

@Slf4j
@Service("CommandReviewService")
public class ReviewServiceImpl implements ReviewService {

    private final ProjectRoomRepository projectRoomRepository;
    private final ProjectReviewRepository projectReviewRepository;
    private final MemberReviewRepository memberReviewRepository;
    private final ParticipantRepository participantRepository;

    @Autowired
    public ReviewServiceImpl(ProjectRoomRepository projectRoomRepository, ProjectReviewRepository projectReviewRepository, MemberReviewRepository memberReviewRepository, ParticipantRepository participantRepository) {
        this.projectRoomRepository = projectRoomRepository;
        this.projectReviewRepository = projectReviewRepository;
        this.memberReviewRepository = memberReviewRepository;
        this.participantRepository = participantRepository;
    }


    // 프로젝트 후기 생성
    @Override
    @Transactional
    public void createProjectReview(ProjectReviewDTO projectReviewDTO) throws AccessDeniedException {
        log.info("[프로젝트 후기 생성] reviewDTO = {}", projectReviewDTO);

        int projectRoomId = projectReviewDTO.getProject_id();
        int reviewerId = projectReviewDTO.getReviewer_id();

        // 프로젝트 존재 여부 확인
        ProjectRoom projectRoom = projectRoomRepository.findById(projectRoomId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 프로젝트입니다."));

        // 팀원 여부 확인
        Participant participant = validateParticipant(projectRoomId, reviewerId, "후기 작성자가 팀원이 아닙니다.");

        boolean exists = projectReviewRepository.existsByProjectRoomAndParticipant(projectRoom, participant);
         if (exists) {
             log.warn("프로젝트 후기가 존재합니다. projectRoomId={}, reviewerId={}", projectRoomId, reviewerId);
             throw new IllegalStateException("이미 프로젝트 후기를 작성하였습니다.");
         }

        // DTO -> ENTITY
        ProjectReview projectReviewEntity = ProjectReview.builder()
                .content(projectReviewDTO.getContent())
                .participant(participant)
                .projectRoom(projectRoom)
                .build();

        try {
            ProjectReview savedProjectReview = projectReviewRepository.save(projectReviewEntity);
            log.info("프로젝트 후기 저장 성공 - {}", savedProjectReview);
        } catch (DataIntegrityViolationException ex) {
            log.error("프로젝트 후기 저장 실패 - 중복 혹은 DB 제약 위반. projectRoomId={}, reviewerId={}",
                    projectRoomId, reviewerId, ex);
            throw new IllegalStateException("프로젝트 후기 저장 중 오류가 발생했습니다.");
        }
    }


    // 팀원 후기 생성
    @Transactional
    @Override
    public void createMemberReview(MemberReviewDTO memberReviewDTO) throws AccessDeniedException {
        log.info("[팀원 후기 생성] reviewDTO = {}", memberReviewDTO);

        int projectRoomId = memberReviewDTO.getProjectId();
        int reviewerId = memberReviewDTO.getReviewerId();
        int revieweeId = memberReviewDTO.getRevieweeId();

        // 프로젝트 여부 확인
        ProjectRoom projectRoom = projectRoomRepository.findById(projectRoomId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 프로젝트입니다."));

        Participant reviewer = validateParticipant(projectRoomId, reviewerId, "후기 작성자가 팀원이 아닙니다.");
        Participant reviewee = validateParticipant(projectRoomId, revieweeId, "후기 대상자가 팀원이 아닙니다.");

        // 중복 체크
        boolean isExistReview = memberReviewRepository.existsByProjectRoomAndReviewerIdAndRevieweeId(projectRoom, reviewer, reviewee);
        if (isExistReview) {
            log.warn("중복 리뷰 감지 - projectRoomId={}, reviewerId={}, revieweeId={}",
                    projectRoomId, reviewerId, revieweeId);
            throw new IllegalStateException("이미 해당 팀원에 대한 리뷰가 존재합니다.");
        }

        // DTO => ENTITY
        MemberReview memberReviewEntity = MemberReview.builder()
                .content(memberReviewDTO.getContent())
                .rate(memberReviewDTO.getRate())
                .reviewerId(reviewer)
                .revieweeId(reviewee)
                .projectRoom(projectRoom)
                .build();
        try {
            MemberReview savedMemberReview = memberReviewRepository.save(memberReviewEntity);
            log.info("팀원 리뷰 저장 성공 - {}", savedMemberReview);
        } catch (DataIntegrityViolationException ex) {
            log.error("팀원 리뷰 저장 실패 - 중복 리뷰 (DB 제약 위반). projectRoomId={}, reviewerId={}, revieweeId={}",
                    projectRoomId, reviewerId, revieweeId, ex);
            throw new IllegalStateException("이미 해당 팀원에 대한 리뷰가 존재합니다.");
        }

    }

    private Participant validateParticipant(int projectRoomId, int participantId, String errorMessage) throws AccessDeniedException {
        boolean isParticipant = participantRepository.existsByProjectRoomIdAndMemberId(projectRoomId, participantId);
        if (!isParticipant) {
            log.warn(errorMessage);
            throw new AccessDeniedException(errorMessage);
        }
        return participantRepository.findById(participantId)
                .orElseThrow(() -> new IllegalArgumentException("참여자를 찾을 수 없습니다."));
    }

}
