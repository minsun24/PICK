package com.nob.pick.achievement.command.application.dto;

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
public class AchievementUpdateRequestDTO {
	private int id;
	private int requirement;
	private int exp;
}
