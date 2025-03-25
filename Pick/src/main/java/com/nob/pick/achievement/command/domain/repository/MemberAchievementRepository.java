package com.nob.pick.achievement.command.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nob.pick.achievement.command.domain.aggregate.MemberAchievement;

public interface MemberAchievementRepository extends JpaRepository<MemberAchievement, Long> {
	List<MemberAchievement> findByMemberId(int memberId);
	Optional<MemberAchievement> findByMemberIdAndAchievementId(Long memberId, Long achievementId);
}
