package com.nob.pick.dailymission.command.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nob.pick.dailymission.command.application.dto.DailyMissionCreateRequestDTO;
import com.nob.pick.dailymission.command.domain.aggregate.DailyMission;
import com.nob.pick.dailymission.command.domain.repository.DailyMissionRepository;

@Service
public class DailyMissionService {

	private final DailyMissionRepository dailyMissionRepository;

	@Autowired
	public DailyMissionService(DailyMissionRepository dailyMissionRepository) {
		this.dailyMissionRepository = dailyMissionRepository;
	}

	public DailyMission addDailyMission(DailyMissionCreateRequestDTO request) {
		DailyMission dailyMission = new DailyMission();
		dailyMission.setContent(request.getContent());
		dailyMission.setExpPoint(request.getExpPoint());
		dailyMission.setDeleted(false);
		dailyMission.setChallengeId(request.getChallengeId());

		return dailyMissionRepository.save(dailyMission);
	}
}
