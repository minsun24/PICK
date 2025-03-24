package com.nob.pick.regulation.command.application.controller;

import com.nob.pick.regulation.command.application.dto.RegulationDTO;
import com.nob.pick.regulation.command.application.service.RegulationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("CommandRegulationController")
@Slf4j
@RequestMapping("/command/regulation")
public class RegulationController {

    private final RegulationService regulationService;

    RegulationController(RegulationService regulationService) {
        this.regulationService = regulationService;
    }

    // 규제 등록
    @PostMapping()
    public ResponseEntity<?> regulation(@RequestBody RegulationDTO newRegulation) {
        regulationService.registRegulation(newRegulation);
        return ResponseEntity.ok().build();
    }

}
