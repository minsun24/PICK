package com.nob.pick.project.query.dto;

import lombok.Data;

@Data
public class ProjectReviewDTO {	// 프로젝트 후기 DTO
	private int id;					// 프로젝트 후기 번호
	private int projectRoomId;		// 프로젝트 방 번호
	private String content; 		// 후기 내용
}
