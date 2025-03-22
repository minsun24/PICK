package com.nob.pick.project.query.controller;

import com.nob.pick.project.query.dto.ProjectMeetingDTO;
import com.nob.pick.project.query.service.MeetingService;
import com.nob.pick.project.query.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/project")
public class MeetingController {

	private final ParticipantService participantService;
	private MeetingService meetingService;

	@Autowired
	public MeetingController(MeetingService meetingService, ParticipantService participantService) {
		this.meetingService = meetingService;
		this.participantService = participantService;
	}
	
	// 프로젝트별 회의록 목록 조회
	@GetMapping("{projectRoomId}/meetings")
	public ResponseEntity<List<ProjectMeetingDTO>> getMeetingList(@PathVariable int projectRoomId, @RequestParam int memberId) {
		log.info("projectRoomId : " + projectRoomId);
		log.info("memberId : " + memberId);

		// 팀원 확인
		boolean isParticipant = participantService.isProjectParticipant(projectRoomId, memberId);

		List<ProjectMeetingDTO> meetingList = meetingService.getMeetingList(projectRoomId);
		return ResponseEntity.ok(meetingList);
	}

}
