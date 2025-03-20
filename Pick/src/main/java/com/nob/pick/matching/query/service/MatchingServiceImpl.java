package com.nob.pick.matching.query.service;

import com.nob.pick.matching.query.dto.MatchingDTO;
import com.nob.pick.matching.query.mapper.MatchingMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MatchingServiceImpl implements MatchingService{
    private final MatchingMapper matchingMapper;

    public MatchingServiceImpl(MatchingMapper matchingMapper) {
        this.matchingMapper = matchingMapper;
    }

    @Override
    @Transactional
    public List<MatchingDTO> findAllMatching() {
        return matchingMapper.selectAllMatching();
    }

}
