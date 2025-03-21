package com.nob.pick.project.query.service;

import com.nob.pick.project.query.dto.ProjectRoomDTO;

import java.util.List;

public interface ProjectRoomService {
    List<ProjectRoomDTO> getFinishedProjects();

    List<ProjectRoomDTO> getActiveProjects();

    List<ProjectRoomDTO> getDeletedProjects();

    List<ProjectRoomDTO> getmatchingProjects();
}
