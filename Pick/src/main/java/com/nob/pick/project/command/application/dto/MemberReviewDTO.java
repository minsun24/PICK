package com.nob.pick.project.command.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class MemberReviewDTO {
    private int id;
    private String title;
    private String content;
    private int reviewerId;
    private int revieweeId;
    private int rate;
    private int projectId;
}
