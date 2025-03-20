package com.nob.pick.project.query.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProjectRoomDTO { // 프로젝트 방 DTO
    private int id;                        // 프로젝트 방 번호
    private String name;                   // 프로젝트 이름
    private String content;                // 프로젝트 소개
    private String isFinished;             // 프로젝트 완료 여부 (Y/N)
    private String isDeleted;              // 프로젝트 삭제 여부 (Y/N)
    private String durationTime;           // 프로젝트 기간
    private int maximumParticipant;        // 프로젝트 최대 인원
    private int sessionCode;               // 프로젝트 입장 코드
    private String startDate;              // 프로젝트 시작일
    private String endDate;                // 프로젝트 종료일
    private int technologyCategoryId;      // 프로젝트 기술 분류 ID
    private String thumbnailImage;         // 프로젝트 썸네일 이미지
    private String introduction;           // 프로젝트 한 줄 소개
    private String projectUrl;             // 프로젝트 링크
}
