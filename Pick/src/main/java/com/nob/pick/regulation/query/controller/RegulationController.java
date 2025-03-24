package com.nob.pick.regulation.query.controller;

import com.nob.pick.regulation.query.dto.RegulationDTO;
import com.nob.pick.regulation.query.service.RegulationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("QueryRegulationController")
@Slf4j
@RequestMapping("query/regulation")
public class RegulationController {

    private RegulationService regulationService;

    @Autowired
    public RegulationController(RegulationService regulationService) {
        this.regulationService = regulationService;
    }

    // 모든 규제 목록 조회
    @GetMapping("/all")
    public ResponseEntity<List<RegulationDTO>> getAllRegulations() {
        List<RegulationDTO> regulations = regulationService.findAllRegulations();
        return ResponseEntity.ok(regulations);

    }

    // 특정 회원 규제 목록 조회
    @GetMapping("/{memberId}")
    public ResponseEntity<List<RegulationDTO>> getRegulationByMember(@PathVariable int memberId) {
        List<RegulationDTO> regulations = regulationService.findRegulationByMemberId(memberId);
        return ResponseEntity.ok(regulations);
    }
    
    
}
