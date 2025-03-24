// package com.nob.pick.achievement;
//
// import java.util.List;
//
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
//
// import com.nob.pick.achievement.query.dto.AchievementQueryDTO;
// import com.nob.pick.achievement.query.dto.MemberAchievementQueryDTO;
// import com.nob.pick.achievement.query.service.AchievementQueryService;
// import com.nob.pick.achievement.query.service.MemberAchievementQueryService;
//
// @SpringBootTest
// public class AchievementTest {
//
// 	@Autowired
// 	public AchievementQueryService achievementQueryService;
//
// 	@Autowired
// 	public MemberAchievementQueryService memberAchievementQueryService;
//
// 	private final int TEST_MEMBER_ID = 2;
//
// 	@Test
// 	@DisplayName("도전 과제 목록 조회")
// 	void testGetAllAchievements() {
// 		List<AchievementQueryDTO> achievements = achievementQueryService.getAllAchievements();
// 		achievements.forEach(System.out::println);
// 	}
//
// 	@Test
// 	@DisplayName("회원별 도전 과제 조회")
// 	void testGetAchievementsByMember() {
// 		List<MemberAchievementQueryDTO> achievementsByMember = memberAchievementQueryService.getAchievementsByMember(TEST_MEMBER_ID);
// 		achievementsByMember.forEach(System.out::println);
// 	}
//
// 	@Test
// 	@DisplayName("회원별 달성한 도전 과제 조회")
// 	void testGetCompletedAchievementsByMember() {
// 		List<MemberAchievementQueryDTO> completedAchievements = memberAchievementQueryService.getCompletedAchievementsByMember(TEST_MEMBER_ID);
// 		completedAchievements.forEach(System.out::println);
// 	}
//
// 	@Test
// 	@DisplayName("회원별 미달성 도전 과제 조회")
// 	void testGetIncompleteAchievementsByMember() {
// 		List<MemberAchievementQueryDTO> incompleteAchievements = memberAchievementQueryService.getIncompleteAchievementsByMember(TEST_MEMBER_ID);
// 		incompleteAchievements.forEach(System.out::println);
// 	}
// }
