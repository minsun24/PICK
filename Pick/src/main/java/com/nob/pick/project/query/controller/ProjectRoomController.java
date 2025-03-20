package com.nob.pick.project.query.controller;

import com.nob.pick.project.query.dto.ProjectRoomDTO;
import com.nob.pick.project.query.service.ProjectRoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/project")
public class ProjectRoomController {
    private final ProjectRoomService projectRoomService;

    @Autowired
    public ProjectRoomController(ProjectRoomService projectRoomService) {
        this.projectRoomService = projectRoomService;
    }

    @GetMapping("finished-projects")
    public List<ProjectRoomDTO> getFinishedProjects() {
        return projectRoomService.getFinishedProjects();
    }
}
