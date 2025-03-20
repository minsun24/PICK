package com.nob.pick.matching.query.mapper;

import com.nob.pick.matching.query.dto.TechnologyCategoryDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TechnologyCategoryMapper {
    List<TechnologyCategoryDTO> selectAllTechnologyCategory();
}
