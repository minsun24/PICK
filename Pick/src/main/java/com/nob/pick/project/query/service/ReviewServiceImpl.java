package com.nob.pick.project.query.service;

import com.nob.pick.project.query.aggregate.MemberReview;
import com.nob.pick.project.query.aggregate.ProjectReview;
import com.nob.pick.project.query.mapper.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewMapper reviewMapper;

    @Autowired
    public ReviewServiceImpl(ReviewMapper reviewMapper) {
        this.reviewMapper = reviewMapper;
    }

    @Override
    public List<ProjectReview> getProjectReviews(int projectId) {
        List<ProjectReview> reviewList = reviewMapper.selectProjectReviewList(projectId);
        return reviewList;
    }

    @Override
    public List<MemberReview> getMemberReviews(int projectId) {
        List<MemberReview> reviewList = reviewMapper.selectMemberReviewList(projectId);
        return reviewList;
    }
}
