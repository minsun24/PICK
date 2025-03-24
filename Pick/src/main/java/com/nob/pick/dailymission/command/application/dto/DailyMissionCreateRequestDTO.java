package com.nob.pick.dailymission.command.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class DailyMissionCreateRequestDTO {
	private String content;
	private Integer expPoint;
	private Integer challengeId;
}
