package com.nob.pick.project.query.controller;

import com.nob.pick.project.query.dto.ProjectRoomDTO;
import com.nob.pick.project.query.service.ProjectRoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    // 완료된 프로젝트 목록 조회
    @GetMapping("finished-projects")
    public ResponseEntity<List<ProjectRoomDTO>> getFinishedProjects() {
        List<ProjectRoomDTO> finishedProjects = projectRoomService.getFinishedProjects();
        return ResponseEntity.ok(finishedProjects);
    }

    // TODO. 완료된 프로젝트 상세 정보 조회 (회원/비회원)


    // 팀원 모집 중인 프로젝트 목록 조회
    @GetMapping("matching-projects")
    public ResponseEntity<List<ProjectRoomDTO>> getMatchingProjects() {
        List<ProjectRoomDTO> finishedProjects = projectRoomService.getmatchingProjects();
        return ResponseEntity.ok(finishedProjects);
    }



    // 관리자 --------------------------------------------------------------
    // 진행 중인 프로젝트 목록 조회
    @GetMapping("active-projects")
    public ResponseEntity<List<ProjectRoomDTO>> getActiveProjects() {
        List<ProjectRoomDTO> finishedProjects = projectRoomService.getActiveProjects();
        return ResponseEntity.ok(finishedProjects);
    }

    // 삭제된 프로젝트 목록 조회
    @GetMapping("deleted-projects")
    public ResponseEntity<List<ProjectRoomDTO>> getDeletedProjects() {
        List<ProjectRoomDTO> finishedProjects = projectRoomService.getDeletedProjects();
        return ResponseEntity.ok(finishedProjects);
    }


}
