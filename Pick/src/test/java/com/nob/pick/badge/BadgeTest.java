// package com.nob.pick.badge;
//
// import java.util.List;
//
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
//
// import com.nob.pick.badge.query.dto.BadgeQueryDTO;
// import com.nob.pick.badge.query.dto.MemberBadgeQueryDTO;
// import com.nob.pick.badge.query.service.BadgeQueryService;
// import com.nob.pick.badge.query.service.MemberBadgeQueryService;
//
// @SpringBootTest
// public class BadgeTest {
//
// 	@Autowired
// 	private BadgeQueryService badgeQueryService;
//
// 	@Autowired
// 	private MemberBadgeQueryService memberBadgeQueryService;
//
// 	private final int TEST_Challenge_ID = 13;
// 	private final int TEST_Member_ID = 2;
//
// 	@Test
// 	@DisplayName("뱃지 목록 조회")
// 	void testGetAllBadges() {
// 		List<BadgeQueryDTO> badges = badgeQueryService.getAllBadges();
// 		badges.forEach(System.out::println);
// 	}
//
// 	@Test
// 	@DisplayName("챌린지별 뱃지 조회")
// 	void testGetBadgesByChallenge() {
// 		List<BadgeQueryDTO> badgesByChallenge = badgeQueryService.getBadgesByChallengeId(TEST_Challenge_ID);
// 		badgesByChallenge.forEach(System.out::println);
// 	}
//
// 	@Test
// 	@DisplayName("회원별 획득 뱃지 조회")
// 	void testGetBadgesByMember() {
// 		List<MemberBadgeQueryDTO> badgesByMember = memberBadgeQueryService.getBadgesByMember(TEST_Member_ID);
// 		badgesByMember.forEach(System.out::println);
// 	}
// }
