package com.nob.pick.project.query.service;

import com.nob.pick.project.query.dto.ProjectMeetingDTO;

import java.util.List;

public interface MeetingService {
    List<ProjectMeetingDTO> getMeetingList(int projectRoomId);
}
