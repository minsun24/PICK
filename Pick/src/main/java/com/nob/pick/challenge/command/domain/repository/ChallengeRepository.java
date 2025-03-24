package com.nob.pick.challenge.command.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nob.pick.challenge.command.domain.aggregate.Challenge;

public interface ChallengeRepository extends JpaRepository<Challenge, Integer> {
}
