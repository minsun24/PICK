package com.nob.pick.matching.query.vo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ResponseMemberProfileVO {
    private int id;
    private int level;
    private String introduce;
    private String preferredArea;
    private Integer score;
    private String imagePath;
    private int memberId;
}
