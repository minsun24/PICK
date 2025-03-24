package com.nob.pick.achievement.command.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nob.pick.achievement.command.application.dto.AchievementCreateRequestDTO;
import com.nob.pick.achievement.command.application.dto.AchievementUpdateRequestDTO;
import com.nob.pick.achievement.command.application.service.AchievementService;
import com.nob.pick.achievement.command.domain.aggregate.Achievement;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/achievement")
@RequiredArgsConstructor
public class AchievementController {

	private final AchievementService achievementService;

	// 도전 과제 추가
	@PostMapping("/add")
	public ResponseEntity<Achievement> createAchievement(@RequestBody AchievementCreateRequestDTO dto) {
		Achievement newAchievement = achievementService.createAchievement(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(newAchievement);
	}

	// 도전 과제 수정
	@PutMapping("/modify/{id}")
	public ResponseEntity<Achievement> updateAchievement(
		@PathVariable Integer id,
		@RequestBody AchievementUpdateRequestDTO dto
	) {
		return ResponseEntity.ok(achievementService.updateAchievement(id, dto));
	}

	// 도전 과제 삭제
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteAchievement(@PathVariable Integer id) {
		achievementService.deleteAchievement(id);
		return ResponseEntity.noContent().build();
	}
}
