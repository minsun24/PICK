package com.nob.pick.project.query.service;

import com.nob.pick.project.query.dao.ParticipantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantServiceImpl implements ParticipantService {
    private ParticipantMapper participantMapper;

    @Autowired
    public ParticipantServiceImpl(ParticipantMapper participantMapper) {
        this.participantMapper = participantMapper;
    }

    // 팀원 여부 체크
    @Override
    public boolean isProjectParticipant(int projectRoomId, int memberId) {
        int count = participantMapper.isProjectParticipant(projectRoomId, memberId);

        return count > 0;
    }
}
