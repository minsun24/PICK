package com.nob.pick.Badge.command.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nob.pick.Badge.command.domain.aggregate.Badge;

public interface BadgeRepository extends JpaRepository<Badge, Integer> {
	Optional<Badge> findByChallengeId(int achievementId);
}
