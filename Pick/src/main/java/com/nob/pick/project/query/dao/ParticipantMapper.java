package com.nob.pick.project.query.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ParticipantMapper {
    int isProjectParticipant(int projectRoomId, int memberId);
}
