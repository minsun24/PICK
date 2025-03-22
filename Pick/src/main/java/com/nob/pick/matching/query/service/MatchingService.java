package com.nob.pick.matching.query.service;

import com.nob.pick.matching.query.dto.MatchingDTO;
import com.nob.pick.matching.query.dto.MatchingEntryDTO;

import java.util.List;

public interface MatchingService {

    List<MatchingDTO> getMatching();

    List<MatchingDTO> getMatchingByTechnologyCategoryId(int technologyCategoryId);

    List<MatchingEntryDTO> getMatchingEntryByMatchingId(int matchingId);
}
