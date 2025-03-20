package com.nob.pick.matching.query.controller;

import com.nob.pick.matching.query.dto.MatchingDTO;
import com.nob.pick.matching.query.service.MatchingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/matching")
public class MatchingController {
    private final MatchingService matchingService;

    public MatchingController(MatchingService matchingService) {
        this.matchingService = matchingService;
    }

    @GetMapping("find-all-matching")
    public List<MatchingDTO> findAllMatching() {

        return matchingService.findAllMatching();
    }

}
