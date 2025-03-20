package com.nob.pick.matching;

import com.nob.pick.matching.query.dto.MatchingDTO;
import com.nob.pick.matching.query.service.MatchingService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MatchingTest {
    @Autowired
    private MatchingService matchingService;

    @Test
    @DisplayName("Select All Matching Test")
    public void selectAllMatchingTest() {
        List<MatchingDTO> t = matchingService.findAllMatching();
        t.forEach(System.out::println);
    }
}
