package com.nob.pick.matching.query.service;

import com.nob.pick.matching.query.dto.MatchingDTO;

import java.util.List;

public interface MatchingService {
    List<MatchingDTO> findAllMatching();
}
