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
public class MeetingImageDTO {		// 회의록 이미지
	private int id; 				// 회의록 아이디
	private String imagePath; 		// 이미지 경로
	private String imageName; 		// 이미지 이름
	private boolean isThumbnail;	// 썸네일 여부
	private int meetingId;			// 회의록 번호
}
