package com.nob.pick.dailymission.command.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nob.pick.dailymission.command.domain.aggregate.DailyMission;

@Repository
public interface DailyMissionRepository extends JpaRepository<DailyMission, Integer> {
	List<DailyMission> findByIsDeletedFalse();
}
