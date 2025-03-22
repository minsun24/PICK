package com.nob.pick.project.query.dao;

import com.nob.pick.project.query.dto.ProjectRoomDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectRoomMapper {
    List<ProjectRoomDTO> selectFinishedProjects();

    List<ProjectRoomDTO> selectActiveProjects();

    List<ProjectRoomDTO> selectDeletedProjects();

    List<ProjectRoomDTO> selectMatchingProjects();
}
