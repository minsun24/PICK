package com.nob.pick.project.command.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nob.pick.project.command.domain.aggregate.entity.ProjectRoom;
import org.springframework.stereotype.Repository;

public interface ProjectRoomRepository extends JpaRepository <ProjectRoom, Integer> {

    boolean existsByIdAndIsDeletedFalse(int projectRoomId);
}
