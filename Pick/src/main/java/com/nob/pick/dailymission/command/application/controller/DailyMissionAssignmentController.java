package com.nob.pick.dailymission.command.application.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nob.pick.dailymission.command.application.service.DailyMissionAssignmentService;

@RestController
@RequiredArgsConstructor
public class DailyMissionAssignmentController {

	private final DailyMissionAssignmentService dailyMissionAssignmentService;

	private static final Logger logger = LoggerFactory.getLogger(DailyMissionAssignmentController.class);

	// 모든 회원에게 일일 미션 부여
	@PostMapping("/daily-mission/assign")
	public ResponseEntity<String> assignDailyMissions() {
		try {
			dailyMissionAssignmentService.assignDailyMissionsToAllMembers();
			return ResponseEntity.ok("일일 미션이 모든 회원에게 부여되었습니다.");
		} catch (Exception e) {
			logger.error("에러 발생", e);
			return ResponseEntity.status(500).body("에러 발생");
		}
	}
}
