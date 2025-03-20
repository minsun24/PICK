package com.nob.pick.matching.query.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MatchingDTO {
    private int id;
    private String createdDateAt;
    private String isCompleted;
    private Integer levelRange;
    private int memberId;
    private int technologyCategoryId;
}
