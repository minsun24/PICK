package com.nob.pick.achievement.command.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nob.pick.achievement.command.domain.aggregate.Achievement;

public interface AchievementRepository extends JpaRepository<Achievement, Integer> {
}
