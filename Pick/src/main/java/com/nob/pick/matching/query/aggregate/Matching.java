package com.nob.pick.matching.query.aggregate;

import lombok.Getter;

import java.util.List;
@Getter
public class Matching {
    private int id;
    private String createdDateAt;
    private String isCompleted;
    private int levelRange;
    private int memberId;
    // ------------------------------
    private List<TechnologyCategory> technologyCategories;
}
