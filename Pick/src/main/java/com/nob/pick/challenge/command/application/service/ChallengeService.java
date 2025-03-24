package com.nob.pick.challenge.command.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nob.pick.challenge.command.domain.aggregate.Challenge;
import com.nob.pick.challenge.command.domain.repository.ChallengeRepository;

@Service
public class ChallengeService {

	private final ChallengeRepository challengeRepository;

	@Autowired
	public ChallengeService(ChallengeRepository challengeRepository) {
		this.challengeRepository = challengeRepository;
	}

	public Challenge addChallenge(String name) {
		Challenge challenge = new Challenge();
		challenge.setName(name);
		return challengeRepository.save(challenge);
	}

	public Challenge updateChallenge(int id, String name) {
		Challenge challenge = challengeRepository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("해당 id의 챌린지가 존재하지 않습니다."));
		challenge.setName(name);
		return challengeRepository.save(challenge);
	}
}
