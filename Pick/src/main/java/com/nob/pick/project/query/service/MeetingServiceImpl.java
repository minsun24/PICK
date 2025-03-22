package com.nob.pick.project.query.service;

import com.nob.pick.project.query.dto.ProjectMeetingDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingServiceImpl implements MeetingService {

    @Override
    public List<ProjectMeetingDTO> getMeetingList(int projectRoomId) {
        return List.of();
    }
}
