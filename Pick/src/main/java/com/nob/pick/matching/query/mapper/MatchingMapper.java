package com.nob.pick.matching.query.mapper;

import com.nob.pick.matching.query.dto.MatchingDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MatchingMapper {
    List<MatchingDTO> selectAllMatching();
}
