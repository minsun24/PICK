package com.nob.pick.dailymission.command.application.dto;

import lombok.Getter;

@Getter
public class DailyMissionRequest {
	private String content;
	private int expPoint;
	private int challengeId;
}
