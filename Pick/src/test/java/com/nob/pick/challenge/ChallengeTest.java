package com.nob.pick.challenge;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.nob.pick.challenge.command.application.controller.ChallengeController;
import com.nob.pick.challenge.command.application.service.ChallengeService;

// import com.nob.pick.challenge.query.dto.ChallengeQueryDTO;
// import com.nob.pick.challenge.query.service.ChallengeQueryService;

@SpringBootTest
public class ChallengeTest {

	// @Autowired
	// private ChallengeQueryService challengeQueryService;

	@Autowired
	private ChallengeService challengeService;

	private MockMvc mockMvc;

	@Autowired
	private ChallengeController challengeController;

	// @Test
	// @DisplayName("챌린지 목록 조회")
	// void testGetAllChallenges() {
	// 	List<ChallengeQueryDTO> achievements = challengeQueryService.getAllChallenges();
	// 	achievements.forEach(System.out::println);
	// }

	@Test
	@DisplayName("챌린지 추가 테스트")
	void testAddChallenge() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(challengeController).build();

		mockMvc.perform(post("/challenge")
				.param("name", "테스트입니다"))
			.andExpect(status().isOk())  // 응답 상태 확인
			.andExpect(jsonPath("$.name").value("테스트입니다"));  // 이름 값 확인
	}

	@Test
	@DisplayName("챌린지 수정 테스트")
	void testUpdateChallenge() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(challengeController).build();

		mockMvc.perform(put("/challenge/16")
				.param("name", "테스트 변경"))
			.andExpect(status().isOk())  // 응답 상태 확인
			.andExpect(jsonPath("$.name").value("테스트 변경"));  // 수정된 이름 확인
	}
}
