package com.nob.pick.matching.query.service;

import com.nob.pick.matching.query.dto.MatchingDTO;
import com.nob.pick.matching.query.dto.MatchingEntryDTO;

import java.util.List;

public interface MatchingEntryService {
    List<MatchingEntryDTO> findAllMatchingEntry();
}
