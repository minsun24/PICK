package com.nob.pick.project.command.application.dto;

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
public class ParticipantDTO {
	private int id;
	private String isManager;
	private int memberId;
	private int projectRoomId;
}
