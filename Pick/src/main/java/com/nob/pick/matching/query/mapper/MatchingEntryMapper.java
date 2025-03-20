package com.nob.pick.matching.query.mapper;

import com.nob.pick.matching.query.dto.MatchingEntryDTO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface MatchingEntryMapper {
    List<MatchingEntryDTO> selectAllMatchingEntry();
}
