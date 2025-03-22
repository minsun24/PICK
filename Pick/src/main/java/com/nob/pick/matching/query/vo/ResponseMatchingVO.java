package com.nob.pick.matching.query.vo;

import com.nob.pick.matching.query.aggregate.TechnologyCategory;
import com.nob.pick.matching.query.dto.TechnologyCategoryDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Setter
@Getter
@ToString
public class ResponseMatchingVO {
    private int id;
    private int memberId;

    private List<TechnologyCategoryDTO> technologyCategories;
}
