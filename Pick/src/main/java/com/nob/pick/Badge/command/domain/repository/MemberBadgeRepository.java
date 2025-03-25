package com.nob.pick.badge.command.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nob.pick.badge.command.domain.aggregate.MemberBadge;

public interface MemberBadgeRepository extends JpaRepository<MemberBadge, Integer> {
	Optional<MemberBadge> findByMemberIdAndBadgeId(Long memberId, int badgeId);
}
