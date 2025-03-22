package com.nob.pick.matching.query.mapper;

import com.nob.pick.matching.query.aggregate.Matching;
import com.nob.pick.matching.query.aggregate.MatchingEntry;
import com.nob.pick.matching.query.dto.MatchingDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MatchingMapper {
    List<Matching> selectAllMatching();

    List<Matching> selectMatchingByMatchingId(int matchingId);

    List<Matching> selectMatchingByTechnologyCategoryId(int technologyCategoryId);

    List<MatchingEntry> selectMatchingEntryByMatchingId(int matchingId);
}
