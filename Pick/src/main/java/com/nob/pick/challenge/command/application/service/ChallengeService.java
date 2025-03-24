package com.nob.pick.challenge.command.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nob.pick.challenge.command.application.dto.ChallengeRequestDTO;
import com.nob.pick.challenge.command.application.dto.ChallengeResponseDTO;
import com.nob.pick.challenge.command.domain.aggregate.Challenge;
import com.nob.pick.challenge.command.domain.repository.ChallengeRepository;

@Service
public class ChallengeService {

	private final ChallengeRepository challengeRepository;

	@Autowired
	public ChallengeService(ChallengeRepository challengeRepository) {
		this.challengeRepository = challengeRepository;
	}

	public Challenge addChallenge(ChallengeRequestDTO request) {
		Challenge challenge = new Challenge(request.getName());
		return challengeRepository.save(challenge);
	}

	public Challenge updateChallenge(int id, ChallengeRequestDTO request) {
		Challenge challenge = challengeRepository.findById(id).orElseThrow(() -> new RuntimeException("해당 id의 챌린지가 없습니다."));
		challenge.setName(request.getName());
		return challengeRepository.save(challenge);
	}
}
