package com.nob.pick.matching.query.controller;

import com.nob.pick.matching.query.aggregate.TechnologyCategory;
import com.nob.pick.matching.query.dto.MatchingDTO;
import com.nob.pick.matching.query.dto.MatchingEntryDTO;
import com.nob.pick.matching.query.service.MatchingService;
import com.nob.pick.matching.query.vo.ResponseMatchingEntryVO;
import com.nob.pick.matching.query.vo.ResponseMatchingVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class MatchingController {
    private final MatchingService matchingService;

    public MatchingController(MatchingService matchingService) {
        this.matchingService = matchingService;
    }

    // 전체 매칭방 조회
    @GetMapping("/matching/all")
    public ResponseEntity<List<ResponseMatchingVO>> findAllMatching() {
        List<MatchingDTO> matchingDTOList = matchingService.getMatching();

        List<ResponseMatchingVO> returnValue = matchingDTO2ResponseMatching(matchingDTOList);

        return ResponseEntity.ok().body(returnValue);
    }

    @GetMapping("/matching/{matchingId}")
    public ResponseEntity<List<ResponseMatchingVO>> findMatchingByMatchingId(@PathVariable int matchingId) {
        List<MatchingDTO> matchingDTOList = matchingService.getMatchingByMatchingId(matchingId);

        List<ResponseMatchingVO> returnValue = matchingDTO2ResponseMatching(matchingDTOList);

        return ResponseEntity.ok().body(returnValue);
    }

    // 카테고리 id로 매칭방 조회
    @GetMapping("/matching/technologyCategories/{technologyCategoryId}")
    public ResponseEntity<List<ResponseMatchingVO>> findMatchingByTechnologyCategoryId(@PathVariable int technologyCategoryId) {
        List<MatchingDTO> matchingDTOList = matchingService.getMatchingByTechnologyCategoryId(technologyCategoryId);

        List<ResponseMatchingVO> returnValue = matchingDTO2ResponseMatching(matchingDTOList);

        return ResponseEntity.ok().body(returnValue);
    }

    // 매칭방 id로 신청자 조회
    @GetMapping("/matchingEntry/matching/{matchingId}")
    public ResponseEntity<List<ResponseMatchingEntryVO>> findMatchingEntryByMatchingId(@PathVariable int matchingId) {
        List<MatchingEntryDTO> matchingEntryDTOList = matchingService.getMatchingEntryByMatchingId(matchingId);

        List<ResponseMatchingEntryVO> returnValue = matchingEntryDTO2ResponseMatchingEntry(matchingEntryDTOList);

        return ResponseEntity.ok().body(returnValue);
    }

    private List<ResponseMatchingEntryVO> matchingEntryDTO2ResponseMatchingEntry(List<MatchingEntryDTO> matchingEntryDTOList) {

        List<ResponseMatchingEntryVO> responseList = new ArrayList<>();

        for(MatchingEntryDTO matchingEntryDTO : matchingEntryDTOList) {
            ResponseMatchingEntryVO responseMatchingEntry = new ResponseMatchingEntryVO();
            responseMatchingEntry.setId(matchingEntryDTO.getId());
            responseMatchingEntry.setMemberId(matchingEntryDTO.getMemberId());
            responseMatchingEntry.setMatchingId(matchingEntryDTO.getMatchingId());

            responseList.add(responseMatchingEntry);
        }

        return responseList;
    }

    private List<ResponseMatchingVO> matchingDTO2ResponseMatching(List<MatchingDTO> matchingDTOList) {

        List<ResponseMatchingVO> responseList = new ArrayList<>();

        for (MatchingDTO matchingDTO : matchingDTOList) {
            ResponseMatchingVO responseMatching = new ResponseMatchingVO();
            responseMatching.setId(matchingDTO.getId());
            responseMatching.setMemberId(matchingDTO.getMemberId());
            responseMatching.setTechnologyCategories(matchingDTO.getTechnologyCategories());

            responseList.add(responseMatching);
        }

        return responseList;
    }
}
