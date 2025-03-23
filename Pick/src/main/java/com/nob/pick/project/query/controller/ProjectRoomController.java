package com.nob.pick.project.query.controller;

import com.nob.pick.project.query.dto.ProjectRoomDTO;
import com.nob.pick.project.query.service.ProjectRoomService;
import com.nob.pick.project.query.vo.ResponseProjectDetailVO;
import com.nob.pick.project.query.vo.ResponseProjectVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @GetMapping("all")
    public ResponseEntity<List<ResponseProjectVO>> getAllProjects() {
        List<ProjectRoomDTO> dtoProjects = projectRoomService.getAllProjects();
        List<ResponseProjectVO> result = projectRoomDTOToVO(dtoProjects);
        return ResponseEntity.ok().body(result);
    }

    // 완료된 프로젝트 목록 전체 조회
    @GetMapping("finishedProjects")
    public ResponseEntity<List<ResponseProjectVO>> getFinishedProjects() {
        List<ProjectRoomDTO> dtoProjects = projectRoomService.getFinishedProjects();
        List<ResponseProjectVO> result = projectRoomDTOToVO(dtoProjects);
        return ResponseEntity.ok().body(result);
    }


    // 완료된 프로젝트 목록 상세 조회
    @GetMapping("finishedProjects/{projectId}")
    public ResponseEntity<ResponseProjectDetailVO> getProjectProjectDetail(@PathVariable int projectId) {
        ProjectRoomDTO detailedProject = projectRoomService.getFinishedProjectDetail(projectId);

        ResponseProjectDetailVO result = projectRoomToDetailDTO(detailedProject);
        return ResponseEntity.ok().body(result);
    }


    // 팀원 모집 중인 프로젝트 목록 조회
    @GetMapping("matchingProjects")
    public ResponseEntity<List<ResponseProjectVO>> getMatchingProjects() {
        List<ProjectRoomDTO> dtoProjects = projectRoomService.getmatchingProjects();
        List<ResponseProjectVO> result = projectRoomDTOToVO(dtoProjects);
        return ResponseEntity.ok().body(result);
    }



    // 관리자 --------------------------------------------------------------
    // 진행 중인 프로젝트 목록 조회
    @GetMapping("activeProjects")
    public ResponseEntity<List<ResponseProjectVO>> getActiveProjects() {
        List<ProjectRoomDTO> dtoProjects = projectRoomService.getActiveProjects();
        List<ResponseProjectVO> result = projectRoomDTOToVO(dtoProjects);
        return ResponseEntity.ok().body(result);
    }

    // 삭제된 프로젝트 목록 조회
    @GetMapping("deletedProjects")
    public ResponseEntity<List<ResponseProjectVO>> getDeletedProjects() {
        List<ProjectRoomDTO> dtoProjects = projectRoomService.getDeletedProjects();
        List<ResponseProjectVO> result = projectRoomDTOToVO(dtoProjects);
        return ResponseEntity.ok().body(result);
    }




    // List<ProjecRoomDTO> -> List<ResponseProjectVO>
    private List<ResponseProjectVO> projectRoomDTOToVO(List<ProjectRoomDTO> ProjectRoomDTOList) {
        List<ResponseProjectVO> responseList = new ArrayList<>();

        for(ProjectRoomDTO dto : ProjectRoomDTOList) {
            ResponseProjectVO vo = new ResponseProjectVO();
            vo.setId(dto.getId());
            vo.setName(dto.getName());
            vo.setStartDate(dto.getStartDate());
            vo.setEndDate(dto.getEndDate());
            vo.setDurationTime(dto.getDurationTime());
            vo.setMaximumParticipant(dto.getMaximumParticipant());
            vo.setThumbnailImage(dto.getThumbnailImage());
            vo.setIntroduction(dto.getIntroduction());

            responseList.add(vo);
        }
        return responseList;
    }

    // ProjectRoom -> ProjectRoomDTO
    private ResponseProjectDetailVO projectRoomToDetailDTO(ProjectRoomDTO projectRoom) {
        ResponseProjectDetailVO vo = new ResponseProjectDetailVO();

        System.out.println(projectRoom);

        vo.setId(projectRoom.getId());
        vo.setName(projectRoom.getName());
        vo.setContent(projectRoom.getContent());
        vo.setStartDate(projectRoom.getStartDate());
        vo.setEndDate(projectRoom.getEndDate());
        vo.setDurationTime(projectRoom.getDurationTime());
        vo.setMaximumParticipant(projectRoom.getMaximumParticipant());
        vo.setIntroduction(projectRoom.getIntroduction());
        vo.setThumbnailImage(projectRoom.getThumbnailImage());

        vo.setTechnologyCategoryId(projectRoom.getTechnologyCategoryId());

        System.out.println(vo);
        return vo;
    }

}
