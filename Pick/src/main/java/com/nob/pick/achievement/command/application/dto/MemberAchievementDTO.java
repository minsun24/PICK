package com.nob.pick.achievement.command.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberAchievementDTO {
	private int id;
	private String achievedDate;
	private Integer progress;
	private Integer achievedTime;
	private int achievementId;
	private int memberId;
}
