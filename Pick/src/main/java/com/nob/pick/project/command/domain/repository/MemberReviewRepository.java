package com.nob.pick.project.command.domain.repository;

import com.nob.pick.project.command.domain.aggregate.entity.MemberReview;
import com.nob.pick.project.command.domain.aggregate.entity.Participant;
import com.nob.pick.project.command.domain.aggregate.entity.ProjectRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberReviewRepository extends JpaRepository<MemberReview, Integer> {
    boolean existsByProjectRoomAndReviewerIdAndRevieweeId(ProjectRoom projectRoom, Participant reviewer, Participant reviewee);
}
