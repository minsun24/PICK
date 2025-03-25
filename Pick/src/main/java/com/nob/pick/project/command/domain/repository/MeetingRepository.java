package com.nob.pick.project.command.domain.repository;

import com.nob.pick.project.command.domain.aggregate.entity.ProjectMeeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingRepository extends JpaRepository<ProjectMeeting, Integer> {
}
