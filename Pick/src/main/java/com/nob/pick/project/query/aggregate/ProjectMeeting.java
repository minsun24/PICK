package com.nob.pick.project.query.aggregate;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@ToString
public class ProjectMeeting {
    private int id;
    private String title;
    private String content;
    private LocalDateTime uploadTime;
    private LocalDateTime updateTime;

    private int authorId;
    private int projectRoomId;
}
