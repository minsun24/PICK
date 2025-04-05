package com.nob.pick.report.query.dto;

import com.nob.pick.report.query.dto.enums.ReportCategory;
import com.nob.pick.report.query.dto.enums.ReportStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Report 데이터를 전달하기 위한 객체

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReportDTO {
    private int id;
    private java.time.LocalDate reportedAt;
    private ReportStatus status;
    private ReportCategory category;
    private int reportedId;
    private boolean isDeleted;
    private int reportReasonId;
    private int memberId;

    private Integer reportedMemberId;

}
