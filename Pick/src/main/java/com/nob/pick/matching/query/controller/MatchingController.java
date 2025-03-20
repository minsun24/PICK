package com.nob.pick.matching.query.controller;

import com.nob.pick.matching.query.service.MatchingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MatchingController {
    private final MatchingService matchingService;

    public MatchingController(MatchingService matchingService) {
        this.matchingService = matchingService;
    }
}
