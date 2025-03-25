package com.nob.pick.badge.command.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nob.pick.badge.command.domain.aggregate.Badge;

public interface BadgeRepository extends JpaRepository<Badge, Integer> {
	Optional<Badge> findByChallengeId(int achievementId);
}
