package com.nob.pick.matching.query.service;

import com.nob.pick.matching.query.dto.MatchingEntryDTO;
import com.nob.pick.matching.query.mapper.MatchingEntryMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MatchingEntryServiceImpl implements MatchingEntryService {
    private final MatchingEntryMapper matchingEntryMapper;

    public MatchingEntryServiceImpl(MatchingEntryMapper matchingEntryMapper) {
        this.matchingEntryMapper = matchingEntryMapper;
    }

    @Override
    @Transactional
    public List<MatchingEntryDTO> findAllMatchingEntry() {
        return matchingEntryMapper.selectAllMatchingEntry();
    }
}
