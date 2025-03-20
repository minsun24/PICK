package com.nob.pick.project.query.service;

import com.nob.pick.project.query.dao.mapper.ProjectRoomMapper;
import com.nob.pick.project.query.dto.ProjectRoomDTO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectRoomServiceImpl implements ProjectRoomService {

    private final ProjectRoomMapper projectRoomMapper;

    @Autowired
    public ProjectRoomServiceImpl(ProjectRoomMapper projectRoomMapper) {
        this.projectRoomMapper = projectRoomMapper;
    }

    @Override
    @Transactional
    public List<ProjectRoomDTO> getFinishedProjects() {

        return projectRoomMapper.selectFinishedProjects();
    }
}
