package com.nob.pick.dailymission.command.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nob.pick.challenge.command.domain.aggregate.Challenge;
import com.nob.pick.dailymission.command.application.dto.DailyMissionRequest;
import com.nob.pick.dailymission.command.application.service.DailyMissionService;
import com.nob.pick.dailymission.command.domain.aggregate.DailyMission;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/daily-mission")
@RequiredArgsConstructor
public class DailyMissionController {
	private final DailyMissionService dailyMissionService;

	// 1. 일일 미션 추가
	@PostMapping("/add")
	public ResponseEntity<DailyMission> createDailyMission(@RequestBody DailyMissionRequest request) {
		DailyMission dailyMission = dailyMissionService.addDailyMission(request.getContent(), request.getExpPoint(), new Challenge(request.getChallengeId()));
		return ResponseEntity.status(HttpStatus.CREATED).body(dailyMission);
	}

	// 2. 일일 미션 수정
	@PutMapping("/modify/{id}")
	public ResponseEntity<DailyMission> updateDailyMission(@PathVariable Integer id, @RequestBody DailyMissionRequest request) {
		DailyMission updatedMission = dailyMissionService.updateDailyMission(id, request.getContent(), request.getExpPoint());
		return ResponseEntity.ok(updatedMission);
	}

	// 3. 일일 미션 삭제
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteDailyMission(@PathVariable Integer id) {
		dailyMissionService.deleteDailyMission(id);
		return ResponseEntity.noContent().build();
	}
}
