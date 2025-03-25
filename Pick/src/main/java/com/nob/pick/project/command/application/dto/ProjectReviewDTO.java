package com.nob.pick.project.command.application.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class ProjectReviewDTO {
    private int id;
    private String content;
    private int reviewer_id;
    private int project_id;
}
