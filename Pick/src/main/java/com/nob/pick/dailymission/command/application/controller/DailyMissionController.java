package com.nob.pick.dailymission.command.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nob.pick.dailymission.command.application.dto.DailyMissionCreateRequestDTO;
import com.nob.pick.dailymission.command.application.service.DailyMissionService;
import com.nob.pick.dailymission.command.domain.aggregate.DailyMission;

@RestController
@RequestMapping("/daily-mission")
public class DailyMissionController {

	private final DailyMissionService dailyMissionService;

	@Autowired
	public DailyMissionController(DailyMissionService dailyMissionService) {
		this.dailyMissionService = dailyMissionService;
	}

	@PostMapping
	public ResponseEntity<DailyMission> addDailyMission(@RequestBody DailyMissionCreateRequestDTO request) {
		DailyMission createdDailyMission = dailyMissionService.addDailyMission(request);
		return new ResponseEntity<>(createdDailyMission, HttpStatus.CREATED);
	}

}
