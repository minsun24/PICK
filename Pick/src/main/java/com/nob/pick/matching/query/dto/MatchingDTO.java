package com.nob.pick.matching.query.dto;

import com.nob.pick.matching.query.aggregate.TechnologyCategory;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MatchingDTO {
    private int id;
    private int memberId;

    private List<TechnologyCategoryDTO> technologyCategories;
}
