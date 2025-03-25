package com.nob.pick.badge.command.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BadgeDTO {
	private Integer requirement;
	private int advantage;
	private String description;
	private Integer challengeId;
}
