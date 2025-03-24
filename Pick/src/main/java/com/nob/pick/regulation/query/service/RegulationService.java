package com.nob.pick.regulation.query.service;

import com.nob.pick.regulation.query.dto.RegulationDTO;

import java.util.List;

public interface RegulationService {
    List<RegulationDTO> findAllRegulations();
}
