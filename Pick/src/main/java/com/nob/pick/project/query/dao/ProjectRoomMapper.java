package com.nob.pick.project.query.dao;

import com.nob.pick.project.query.aggregate.ProjectRoom;
import com.nob.pick.project.query.dto.ProjectRoomDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectRoomMapper {
    List<ProjectRoom> selectFinishedProjects();

    List<ProjectRoom> selectActiveProjects();

    List<ProjectRoom> selectDeletedProjects();

    List<ProjectRoom> selectMatchingProjects();

    ProjectRoom selectFinishedProjectDetail(int projectId);

    List<ProjectRoom> selectAllProjects();
}
