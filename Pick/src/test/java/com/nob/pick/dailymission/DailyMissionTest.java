// package com.nob.pick.dailymission;
//
// import java.util.List;
//
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
//
// import com.nob.pick.dailymission.query.dto.DailyMissionQueryDTO;
// import com.nob.pick.dailymission.query.dto.MemberDailyMissionQueryDTO;
// import com.nob.pick.dailymission.query.service.DailyMissionQueryService;
// import com.nob.pick.dailymission.query.service.MemberDailyMissionQueryService;
//
// @SpringBootTest
// public class DailyMissionTest {
//
// 	@Autowired
// 	private DailyMissionQueryService dailyMissionQueryService;
//
// 	@Autowired
// 	private MemberDailyMissionQueryService memberDailyMissionQueryService;
//
// 	private final int TEST_MEMBER_ID = 1;
//
// 	@Test
// 	@DisplayName("일일 미션 목록 조회")
// 	void testGetAllDailyMissions() {
// 		List<DailyMissionQueryDTO> dailymissions = dailyMissionQueryService.getAllDailyMissions();
// 		dailymissions.forEach(System.out::println);
// 	}
//
// 	@Test
// 	@DisplayName("회원별 일일 미션 조회")
// 	void testGetDailyMissionsByMember() {
// 		List<MemberDailyMissionQueryDTO> memberDailyMissions = memberDailyMissionQueryService.getDailyMissionsByMember(TEST_MEMBER_ID);
// 		memberDailyMissions.forEach(System.out::println);
// 	}
//
// 	@Test
// 	@DisplayName("회원별 수행 일일 미션 조회")
// 	void testGetCompletedDailyMissions() {
// 		Boolean status = true;
// 		List<MemberDailyMissionQueryDTO> memberDailyMissions = memberDailyMissionQueryService.getDailyMissionsByMemberWithStatus(TEST_MEMBER_ID, status);
// 		memberDailyMissions.forEach(System.out::println);
// 	}
//
// 	@Test
// 	@DisplayName("회원별 미수행 일일 미션 조회")
// 	void testGetIncompleteDailyMissions() {
// 		Boolean status = false;
// 		List<MemberDailyMissionQueryDTO> memberDailyMissions = memberDailyMissionQueryService.getDailyMissionsByMemberWithStatus(TEST_MEMBER_ID, status);
// 		memberDailyMissions.forEach(System.out::println);
// 	}
// }
