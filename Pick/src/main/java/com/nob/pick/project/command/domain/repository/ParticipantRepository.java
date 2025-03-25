package com.nob.pick.project.command.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nob.pick.project.command.domain.aggregate.entity.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
    boolean existsByProjectRoomIdAndMemberId(int projectRoomId, int memberId);
}
