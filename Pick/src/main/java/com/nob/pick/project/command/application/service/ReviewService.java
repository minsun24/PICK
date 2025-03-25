package com.nob.pick.project.command.application.service;

import com.nob.pick.project.command.application.dto.MemberReviewDTO;
import com.nob.pick.project.command.application.dto.ProjectReviewDTO;

import java.nio.file.AccessDeniedException;

public interface ReviewService{
    void createProjectReview(ProjectReviewDTO projectReview) throws AccessDeniedException;

    void createMemberReview(MemberReviewDTO memberReview) throws AccessDeniedException;
}
