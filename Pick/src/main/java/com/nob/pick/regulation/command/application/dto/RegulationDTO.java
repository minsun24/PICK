package com.nob.pick.regulation.command.application.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class RegulationDTO {
    private int memberId;
    private int count;      // 쿼리에서 조회된 제재 횟수
}
