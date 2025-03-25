package com.nob.pick.achievement.command.application.dto;

import com.nob.pick.achievement.command.domain.aggregate.Achievement;

import lombok.Getter;

@Getter
public class AchievementResponseDTO {
	private int id;
	private int requirement;
	private int exp;
	private boolean isDeleted;
	private int challengeId;

	public AchievementResponseDTO(Achievement achievement) {
		this.id = achievement.getId();
		this.requirement = achievement.getRequirement();
		this.exp = achievement.getExp();
		this.isDeleted = achievement.isDeleted();
		this.challengeId = achievement.getChallenge().getId();
	}
}
