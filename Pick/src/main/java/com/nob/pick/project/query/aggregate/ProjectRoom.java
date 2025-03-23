package com.nob.pick.project.query.aggregate;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ProjectRoom {
    private int id;                        // 프로젝트 방 번호
    private String name;                   // 프로젝트 이름
    private String content;                // 프로젝트 소개
    private boolean isFinished;             // 프로젝트 완료 여부 (Y/N)
    private boolean isDeleted;              // 프로젝트 삭제 여부 (Y/N)
    private String durationTime;           // 프로젝트 기간
    private int maximumParticipant;        // 프로젝트 최대 인원
    private Integer sessionCode;               // 프로젝트 입장 코드
    private String startDate;              // 프로젝트 시작일
    private String endDate;                // 프로젝트 종료일
    private String thumbnailImage;         // 프로젝트 썸네일 이미지
    private String introduction;           // 프로젝트 한 줄 소개
    private String projectUrl;             // 프로젝트 링크

    private Integer technologyCategoryId;      // 프로젝트 기술 분류 ID
}
