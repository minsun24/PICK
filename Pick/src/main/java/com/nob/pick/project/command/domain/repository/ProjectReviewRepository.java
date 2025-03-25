package com.nob.pick.project.command.domain.repository;

import com.nob.pick.project.command.domain.aggregate.entity.Participant;
import com.nob.pick.project.command.domain.aggregate.entity.ProjectReview;
import com.nob.pick.project.command.domain.aggregate.entity.ProjectRoom;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectReviewRepository extends JpaRepository <ProjectReview, Integer> {
    boolean existsByProjectRoomAndParticipant(ProjectRoom projectRoom, Participant participant);
}
