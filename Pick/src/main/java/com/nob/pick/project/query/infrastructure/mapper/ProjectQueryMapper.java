package com.nob.pick.project.query.infrastructure.mapper;

import com.nob.pick.project.query.application.ProjectRoomDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectQueryMapper {
    List<ProjectRoomDTO> selectFinishedProjects();

}
