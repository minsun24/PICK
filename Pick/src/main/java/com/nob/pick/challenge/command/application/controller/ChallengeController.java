package com.nob.pick.challenge.command.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

	@PostMapping
	public Challenge addChallenge(@RequestParam String name) {
		return challengeService.addChallenge(name);
	}

	@PutMapping("/{id}")
	public Challenge updateChallenge(@PathVariable int id, @RequestParam String name) {
		return challengeService.updateChallenge(id, name);
	}
}
