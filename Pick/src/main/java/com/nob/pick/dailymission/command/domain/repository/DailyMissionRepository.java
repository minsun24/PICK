package com.nob.pick.dailymission.command.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nob.pick.dailymission.command.domain.aggregate.DailyMission;

public interface DailyMissionRepository extends JpaRepository<DailyMission, Integer> {
}
