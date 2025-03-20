package com.nob.pick.matching.query.controller;

import com.nob.pick.matching.query.dto.MatchingEntryDTO;
import com.nob.pick.matching.query.service.MatchingEntryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/matching-entry")
public class MatchingEntryController {
    private final MatchingEntryService matchingEntryService;

    public MatchingEntryController(MatchingEntryService matchingEntryService) {
        this.matchingEntryService = matchingEntryService;
    }

    @GetMapping("find-all-matching-entry")
    public List<MatchingEntryDTO> findAllMatchingEntry() {

        return matchingEntryService.findAllMatchingEntry();
    }
}
