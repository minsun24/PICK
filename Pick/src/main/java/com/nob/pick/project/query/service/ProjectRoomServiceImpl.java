package com.nob.pick.project.query.service;

import com.nob.pick.project.query.aggregate.ProjectRoom;
import com.nob.pick.project.query.dao.ProjectRoomMapper;
import com.nob.pick.project.query.dto.ProjectRoomDTO;
import jakarta.transaction.Transactional;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectRoomServiceImpl implements ProjectRoomService {

    private final ProjectRoomMapper projectRoomMapper;

    @Autowired
    public ProjectRoomServiceImpl(ProjectRoomMapper projectRoomMapper) {
        this.projectRoomMapper = projectRoomMapper;
    }

    @Override
    public List<ProjectRoomDTO> getAllProjects() {
        List<ProjectRoom> projectRoomList = projectRoomMapper.selectAllProjects();

        return projectRoomToDTO(projectRoomList);
    }

    @Override
    @Transactional
    public List<ProjectRoomDTO> getFinishedProjects() {
        List<ProjectRoom> projectRoomList = projectRoomMapper.selectFinishedProjects();

        return projectRoomToDTO(projectRoomList);
    }


    @Override
    @Transactional
    public List<ProjectRoomDTO> getActiveProjects() {
        List<ProjectRoom> projectRoomList = projectRoomMapper.selectActiveProjects();

        return projectRoomToDTO(projectRoomList);
    }

    @Override
    public List<ProjectRoomDTO> getDeletedProjects() {
        List<ProjectRoom> projectRoomList = projectRoomMapper.selectDeletedProjects();

        return projectRoomToDTO(projectRoomList);
    }

    @Override
    public List<ProjectRoomDTO> getmatchingProjects() {
        List<ProjectRoom> projectRoomList = projectRoomMapper.selectMatchingProjects();

        return projectRoomToDTO(projectRoomList);
    }

    @Override
    public ProjectRoomDTO getFinishedProjectDetail(int projectId) {
        ProjectRoom projectDetail = projectRoomMapper.selectFinishedProjectDetail(projectId);

        if (projectDetail == null) {
            try {
                throw new NotFoundException("프로젝트를 찾을 수 없습니다. projectId=" + projectId);
            } catch (NotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        return projectRoomDetailToDTO(projectDetail);

    }

    private ProjectRoomDTO projectRoomDetailToDTO(ProjectRoom projectDetail) {
        ProjectRoomDTO dto = new ProjectRoomDTO();

        dto.setId(projectDetail.getId());
        dto.setName(projectDetail.getName());
        dto.setContent(projectDetail.getContent());
        dto.setStartDate(projectDetail.getStartDate());
        dto.setEndDate(projectDetail.getEndDate());
        dto.setDurationTime(projectDetail.getDurationTime());
        dto.setProjectUrl(projectDetail.getProjectUrl());
        dto.setIntroduction(projectDetail.getIntroduction());
        dto.setThumbnailImage(projectDetail.getThumbnailImage());
        dto.setMaximumParticipant(projectDetail.getMaximumParticipant());
        dto.setTechnologyCategoryId(projectDetail.getTechnologyCategoryId());

        return dto;
    }


    // ProjectRoom -> ProjectRoomDTO
    private List<ProjectRoomDTO> projectRoomToDTO(List<ProjectRoom> projectRoomList) {

        List<ProjectRoomDTO> projectRoomDTOList = new ArrayList<>();

        for(ProjectRoom projectRoom : projectRoomList) {
            ProjectRoomDTO dto = new ProjectRoomDTO();
            dto.setId(projectRoom.getId());
            dto.setName(projectRoom.getName());
            dto.setContent(projectRoom.getContent());
            dto.setStartDate(projectRoom.getStartDate());
            dto.setEndDate(projectRoom.getEndDate());
            dto.setDurationTime(projectRoom.getDurationTime());
            dto.setMaximumParticipant(projectRoom.getMaximumParticipant());
            dto.setTechnologyCategoryId(projectRoom.getTechnologyCategoryId());
            dto.setThumbnailImage(projectRoom.getThumbnailImage());
            dto.setIntroduction(projectRoom.getIntroduction());
            dto.setThumbnailImage(projectRoom.getThumbnailImage());

            projectRoomDTOList.add(dto);
        }
        return projectRoomDTOList;

    }

}
