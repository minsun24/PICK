package com.nob.pick.matching.query.controller;

import com.nob.pick.matching.query.dto.TechnologyCategoryDTO;
import com.nob.pick.matching.query.service.TechnologyCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/technology-category")
public class TechnologyCategoryController {
    private final TechnologyCategoryService technologyCategoryService;

    public TechnologyCategoryController(TechnologyCategoryService technologyCategoryService) {
        this.technologyCategoryService = technologyCategoryService;
    }

    @GetMapping("/find-all-technology-category")
    public List<TechnologyCategoryDTO> findAllTechnologyCategory() {
        return technologyCategoryService.findAllTechnologyCategory();
    }
}
