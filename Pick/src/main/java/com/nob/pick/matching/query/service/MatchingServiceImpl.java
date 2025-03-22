package com.nob.pick.matching.query.service;

import com.nob.pick.matching.query.aggregate.Matching;
import com.nob.pick.matching.query.aggregate.MatchingEntry;
import com.nob.pick.matching.query.aggregate.TechnologyCategory;
import com.nob.pick.matching.query.dto.MatchingDTO;
import com.nob.pick.matching.query.dto.MatchingEntryDTO;
import com.nob.pick.matching.query.dto.TechnologyCategoryDTO;
import com.nob.pick.matching.query.mapper.MatchingMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchingServiceImpl implements MatchingService{
    private final MatchingMapper matchingMapper;

    public MatchingServiceImpl(MatchingMapper matchingMapper) {
        this.matchingMapper = matchingMapper;
    }

    @Override
    public List<MatchingDTO> getMatching() {
        List<Matching> matchingList = matchingMapper.selectAllMatching();

        List<MatchingDTO> matchingDTOList = matching2MatchingDTO(matchingList);

        return matchingDTOList;
    }

    @Override
    public List<MatchingDTO> getMatchingByMatchingId(int matchingId) {
        List<Matching> matchingList = matchingMapper.selectMatchingByMatchingId(matchingId);

        List<MatchingDTO> matchingDTOList = matching2MatchingDTO(matchingList);

        return matchingDTOList;
    }

    @Override
    public List<MatchingDTO> getMatchingByTechnologyCategoryId(int technologyCategoryId) {
        List<Matching> matchingList = matchingMapper.selectMatchingByTechnologyCategoryId(technologyCategoryId);

        List<MatchingDTO> matchingDTOList = matching2MatchingDTO(matchingList);

        return matchingDTOList;
    }

    @Override
    public List<MatchingEntryDTO> getMatchingEntryByMatchingId(int matchingId) {
        List<MatchingEntry> matchingEntryList = matchingMapper.selectMatchingEntryByMatchingId(matchingId);

        List<MatchingEntryDTO> matchingEntryDTOList = matchingEntry2MatchingEntryDTO(matchingEntryList);

        return matchingEntryDTOList;
    }

    private List<MatchingEntryDTO> matchingEntry2MatchingEntryDTO(List<MatchingEntry> matchingEntryList) {
        List<MatchingEntryDTO> matchingEntryDTOList = new ArrayList<>();
        for(MatchingEntry matchingEntry : matchingEntryList) {
            MatchingEntryDTO matchingEntryDTO = new MatchingEntryDTO();
            matchingEntryDTO.setId(matchingEntry.getId());
            matchingEntryDTO.setMemberId(matchingEntry.getMemberId());
            matchingEntryDTO.setMatchingId(matchingEntry.getMatchingId());

            matchingEntryDTOList.add(matchingEntryDTO);
        }
        return matchingEntryDTOList;
    }

    private List<MatchingDTO> matching2MatchingDTO(List<Matching> matchingList) {
        List<MatchingDTO> matchingDTOList = new ArrayList<>();
        for (Matching matching : matchingList) {
            MatchingDTO matchingDTO = new MatchingDTO();
            matchingDTO.setId(matching.getId());
            matchingDTO.setMemberId(matching.getMemberId());

            List<TechnologyCategory> technologyCategoryList = matching.getTechnologyCategories();
            List<TechnologyCategoryDTO> technologyCategoryDTOList = new ArrayList<>();
            for (TechnologyCategory technologyCategory : technologyCategoryList) {
                TechnologyCategoryDTO technologyCategoryDTO = new TechnologyCategoryDTO();
                technologyCategoryDTO.setId(technologyCategory.getId());
                technologyCategoryDTO.setName(technologyCategory.getName());
                technologyCategoryDTO.setRefTechnologyCategoryId(technologyCategory.getRefTechnologyCategoryId());

                technologyCategoryDTOList.add(technologyCategoryDTO);
            }

            matchingDTO.setTechnologyCategories(technologyCategoryDTOList);
            matchingDTOList.add(matchingDTO);
        }

        return matchingDTOList;
    }
}
