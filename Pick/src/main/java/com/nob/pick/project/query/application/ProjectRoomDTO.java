package com.nob.pick.project.query.application;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProjectRoomDTO {
    private int id;
    private String name;
    private String introduction;
    private String content;
    private Boolean isFinished;
    private Boolean isDeleted;
    private String duration_time;
    private int maximumParticipants;
    private int sessionCode;
    private int technologyCategoryId;
    private String projectUrl;
    private String thumbnailImage;
    private String startDate;
    private String endDate;
}
