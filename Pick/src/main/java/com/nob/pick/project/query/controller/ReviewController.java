package com.nob.pick.project.query.controller;

import com.nob.pick.project.query.aggregate.MemberReview;
import com.nob.pick.project.query.aggregate.ProjectReview;
import com.nob.pick.project.query.service.ParticipantService;
import com.nob.pick.project.query.service.ReviewService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("QueryReviewController")
@Slf4j

public class ReviewController {
    private final ReviewService reviewService;
    private final ParticipantService participantService;


    @Autowired
    public ReviewController(ReviewService reviewService, ParticipantService participantService) {
        this.reviewService = reviewService;
        this.participantService = participantService;
    }
    
    // 프로젝트별 프로젝트 후기 목록 조회
    @GetMapping("/project/{projectId}/projectReviews")
    public ResponseEntity<?> getProjectReviews(@PathVariable("projectId") int projectId) {
        log.info("프로젝트 후기 목록 조회: projectId={}, memberId={}", projectId);

        List<ProjectReview> projectReviewList = reviewService.getProjectReviews(projectId);
        if(projectReviewList.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("해당 프로젝트가 존재하지 않습니다.");
        }
        return ResponseEntity.ok(projectReviewList);
    }
    
    // 프로젝트별 팀원 후기 목록 조회
    @GetMapping("/project/{projectId}/memberReviews")
    public ResponseEntity<?> getMemberReviews(@PathVariable("projectId") int projectId){
        log.info("프로젝트 후기 목록 조회: projectId={}, memberId={}", projectId);

        List<MemberReview> projectReviewList = reviewService.getMemberReviews(projectId);
        if(projectReviewList.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("해당 프로젝트가 존재하지 않습니다.");
        }
        return ResponseEntity.ok(projectReviewList);
    }

}
