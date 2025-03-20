package com.nob.pick.project.query.dto;

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
public class ProjectMeetingDTO {
	private int id;				// 회의록 번호
	private String title;		// 회의록 제목
	private String content;		// 회의록 내용
	private int projectRoomId;	// 프로젝트 방 번호
	private int authorId; 		// 회의록 작성자
	private String uploadTime;	// 작성일
	private String updateTime;	// 수정일
}
