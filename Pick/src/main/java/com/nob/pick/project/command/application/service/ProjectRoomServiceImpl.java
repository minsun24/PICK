package com.nob.pick.project.command.application.service;

import java.security.SecureRandom;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nob.pick.project.command.application.dto.ProjectRoomDTO;
import com.nob.pick.project.command.application.dto.RequestProjectRoomDTO;
import com.nob.pick.project.command.domain.aggregate.entity.ProjectRoom;
import com.nob.pick.project.command.domain.repository.ProjectRoomRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("CommandProjectRoomService")
public class ProjectRoomServiceImpl implements ProjectRoomService {
	private final ProjectRoomRepository projectRoomRepository;

	@Autowired
	public ProjectRoomServiceImpl(ProjectRoomRepository projectRoomRepository) {
		this.projectRoomRepository = projectRoomRepository;
	}

	// 자율 매칭 방 생성
	@Override
	@Transactional
	public void createNonMatchingProject(RequestProjectRoomDTO newProjectRoom) {
		int durationMonth = parseDurationMonth(newProjectRoom.getDurationTime());
		LocalDate now = LocalDate.now();

		String durationTimeStr = durationMonth + "개월";
		String startDateStr = now.toString();
		String endDateStr = now.plusMonths(durationMonth).toString();

		int sessionCode = generateRangeRandomNum();
		log.info("생성된 세션 코드: {}", sessionCode);

		ProjectRoom projectRoom = ProjectRoom.builder()
			.name(newProjectRoom.getName())
			.content(newProjectRoom.getContent())
			.maximumParticipant(newProjectRoom.getMaximumParticipant())
			.durationTime(durationTimeStr)
			.startDate(LocalDate.parse(startDateStr))
			.endDate(LocalDate.parse(endDateStr))
			.sessionCode(sessionCode)
			.isFinished(false)
			.isDeleted(false)
			.thumbnailImage(null)
			.introduction(null)
			.thumbnailImage(null)
			.technologyCategoryId(newProjectRoom.getTechnologyCategory())
			.build();
		System.out.println("projectRoom = " + projectRoom);

		ProjectRoom savedProjectRoom = projectRoomRepository.save(projectRoom);
		// 확인
		log.info("Project Room 생성 완료! ID: {}", savedProjectRoom.getId());
		//
		// // 4. 팀원 insert 로직 (roomId 활용 가능)
		// insertParticipants(newProjectRoom.getParticipantList(), roomId);

	}

	private int parseDurationMonth(String durationTime) {
		String numberStr = durationTime.replaceAll("[^0-9]", "");

		if (numberStr.isEmpty()) {
			throw new IllegalArgumentException("유효한 개월 수가 없습니다: " + durationTime);
		}

		return Integer.parseInt(numberStr);
	}

	/* *
	 * 시작 범위(start)와 종료 범위(end) 값을 받아서 랜덤한 숫자를 반환 받습니다.
	 *
	 *   @param   start 시작 범위
	 *   @param   end   종료 범위
	 *   @return 랜덤한 숫자
	 */
	public static int generateRangeRandomNum() {
		SecureRandom secureRandom = new SecureRandom();
		int start = 100000;
		int end = 999999;
		return start + secureRandom.nextInt(end - start + 1);
	}


}
