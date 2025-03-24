package com.nob.pick.Badge.command.application.dto;

import org.springframework.stereotype.Service;

import lombok.Getter;

@Getter
@Service
public class BadgeAwardDTO {

	private Long memberId;
	private int badgeId;
}
