package com.nob.pick.project.command.application.service;

import com.nob.pick.project.command.application.dto.RequestProjectRoomDTO;

public interface ProjectRoomService {

	void createNonMatchingProject(RequestProjectRoomDTO newProjectRoom);

	void createMatchingProject(RequestProjectRoomDTO newProjectRoom);

	boolean isProjectExists(int porjectId);

	boolean isParticipant(int projectRoomId, int reviewerId);
}
