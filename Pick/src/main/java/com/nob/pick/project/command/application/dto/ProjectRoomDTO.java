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
public class ProjectRoomDTO {
	private int id;  							  // 방번호
	private String name; 						  // 방 이름
	private String content;						  // 방 설명
	private int maximumParticipant;				  // 방 최대 인원
	private int technologyCategory;  			  // 카테고리

	private String durationTime;			      // 개발 기간
	private String startDate;				      // 생성일
	private String endDate;						  // 예정 마감일
	private int sessionCode;
	// private List<ParticipantDTO> participantList; // 팀원 목록
}

