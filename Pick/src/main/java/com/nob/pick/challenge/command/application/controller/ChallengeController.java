package com.nob.pick.challenge.command.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nob.pick.challenge.command.application.dto.ChallengeRequestDTO;
import com.nob.pick.challenge.command.application.dto.ChallengeResponseDTO;
import com.nob.pick.challenge.command.application.service.ChallengeService;
import com.nob.pick.challenge.command.domain.aggregate.Challenge;

@RestController
@RequestMapping("/challenge")
public class ChallengeController {

	private final ChallengeService challengeService;

	@Autowired
	public ChallengeController(ChallengeService challengeService) {
		this.challengeService = challengeService;
	}

	// 챌린지 추가
	@PostMapping
	public ResponseEntity<ChallengeResponseDTO> addChallenge(@RequestBody ChallengeRequestDTO request) {
		Challenge challenge = challengeService.addChallenge(request);
		ChallengeResponseDTO responseDTO = new ChallengeResponseDTO(challenge.getId(), challenge.getName());
		return ResponseEntity.ok(responseDTO);
	}

	// 챌린지 수정
	@PutMapping("/{id}")
	public ResponseEntity<ChallengeResponseDTO> updateChallenge(@PathVariable int id, @RequestBody ChallengeRequestDTO request) {
		Challenge challenge = challengeService.updateChallenge(id, request);
		ChallengeResponseDTO responseDTO = new ChallengeResponseDTO(challenge.getId(), challenge.getName());
		return ResponseEntity.ok(responseDTO);
	}
}
