package com.nob.pick.dailymission.command.domain.repository;

import com.nob.pick.dailymission.command.domain.aggregate.MemberDailyMission;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface MemberDailyMissionRepository extends JpaRepository<MemberDailyMission, Integer> {
	// 일주일 이전의 일일 미션을 삭제하기 위한 메소드
	// @Query("DELETE FROM MemberDailyMission m WHERE m.acceptedDate < :date")
	// void deleteAllByAcceptedDateBefore(@Param("date") String date);

	List<MemberDailyMission> findByMemberId(Long memberId);

	// 1주일 이상 지난 미션을 조회하는 메서드
	// List<MemberDailyMission> findByAcceptedDateBefore(String date);
}