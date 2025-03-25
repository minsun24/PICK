package com.nob.pick.achievement.command.application.dto;

import com.nob.pick.achievement.command.domain.aggregate.Achievement;
import com.nob.pick.challenge.command.domain.aggregate.Challenge;

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
public class AchievementCreateRequestDTO {
	private int requirement;
	private int exp;
	private int challengeId;

	public Achievement toEntity(Challenge challenge) {
		return new Achievement(requirement, exp, challenge);
	}
}
