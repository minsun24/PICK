package com.nob.pick.matching.query.service;

import com.nob.pick.matching.query.dto.TechnologyCategoryDTO;
import com.nob.pick.matching.query.mapper.TechnologyCategoryMapper;

import java.util.List;

public interface TechnologyCategoryService {
    List<TechnologyCategoryDTO> findAllTechnologyCategory();
}
