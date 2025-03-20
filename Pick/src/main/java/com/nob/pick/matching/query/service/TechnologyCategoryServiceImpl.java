package com.nob.pick.matching.query.service;

import com.nob.pick.matching.query.dto.TechnologyCategoryDTO;
import com.nob.pick.matching.query.mapper.TechnologyCategoryMapper;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyCategoryServiceImpl implements TechnologyCategoryService{
    private final TechnologyCategoryMapper technologyCategoryMapper;

    public TechnologyCategoryServiceImpl(TechnologyCategoryMapper technologyCategoryMapper) {
        this.technologyCategoryMapper = technologyCategoryMapper;
    }

    @Override
    @Transactional
    public List<TechnologyCategoryDTO> findAllTechnologyCategory() {
        return technologyCategoryMapper.selectAllTechnologyCategory();
    }

}
