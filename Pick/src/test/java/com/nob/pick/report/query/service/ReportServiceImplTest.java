package com.nob.pick.report.query.service;

import com.nob.pick.report.query.dto.ReportDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class ReportServiceImplTest {

    @Autowired
    ReportService reportService;

    private static Stream<Arguments> getMemberIds() {
        return Stream.of(
                Arguments.of(1),
                Arguments.of(2)
        );
    }

    @DisplayName("회원 ID로 신고 목록 조회 테스트")
    @ParameterizedTest
    @MethodSource("getMemberIds")
    void testFindReportsByMemberId(int memberId) {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<ReportDTO> reports = reportService.findReportsByMemberId(memberId);
                    Assertions.assertNotNull(reports);
                }
        );
    }

    @DisplayName("전체 신고 조회 테스트")
    @Test
    void testFindAllReports() {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<ReportDTO> reports = reportService.findAllReports();
                    Assertions.assertNotNull(reports);
                }
        );
    }

    // 상태 저장
    private static Stream<Arguments> getStatuses() {
        return Stream.of(
                Arguments.of(0), // 미처리
                Arguments.of(1)  // 처리 완료
        );
    }

    @DisplayName("신고 상태별 조회 테스트")
    @ParameterizedTest
    @MethodSource("getStatuses")
    void testFindReportsByStatus(int status) {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<ReportDTO> reports = reportService.findReportsByStatus(status);
                    Assertions.assertNotNull(reports);
                }
        );
    }

    // 삭제 여부
    private static Stream<Arguments> getDeletionFlags() {
        return Stream.of(
                Arguments.of(true),
                Arguments.of(false)
        );
    }

    @DisplayName("삭제 여부로 신고 조회 테스트")
    @ParameterizedTest
    @MethodSource("getDeletionFlags")
    void testFindReportsByDeletion(boolean isDeleted) {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<ReportDTO> reports = reportService.findReportsByDeletion(isDeleted);
                    Assertions.assertNotNull(reports);
                }
        );
    }
}