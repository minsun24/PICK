package com.nob.pick.dailymission.command.application.service;

import org.springframework.stereotype.Service;

import com.nob.pick.challenge.command.domain.aggregate.Challenge;
import com.nob.pick.dailymission.command.domain.aggregate.DailyMission;
import com.nob.pick.dailymission.command.domain.repository.DailyMissionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DailyMissionService {
	private final DailyMissionRepository dailyMissionRepository;

	// 1. 일일 미션 추가
	public DailyMission addDailyMission(String content, Integer expPoint, Challenge challenge) {
		DailyMission dailyMission = new DailyMission(content, expPoint, challenge);
		return dailyMissionRepository.save(dailyMission);
	}

	// 2. 일일 미션 수정
	public DailyMission updateDailyMission(Integer id, String content, Integer expPoint) {
		DailyMission dailyMission = dailyMissionRepository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("미션을 찾을 수 없습니다."));
		dailyMission.update(content, expPoint);
		dailyMissionRepository.flush();
		dailyMission.getChallenge().getName();
		return dailyMissionRepository.save(dailyMission);
	}

	// 3. 일일 미션 삭제
	public void deleteDailyMission(Integer id) {
		DailyMission dailyMission = dailyMissionRepository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("미션을 찾을 수 없습니다."));
		dailyMission.softDelete();
		dailyMissionRepository.save(dailyMission);
	}
}
