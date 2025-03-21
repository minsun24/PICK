package com.nob.pick.project.query.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
// @RequestMapping("/project/${projectId}/meeting")
public class MeetingController {

	//
	@GetMapping(value="/project/{projectRoomId}/meetings")

}
