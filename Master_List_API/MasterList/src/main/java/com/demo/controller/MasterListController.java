package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.MasterListDTO;
import com.demo.service.MasterListService;

@RestController
@RequestMapping("/v2")
public class MasterListController {

    private final MasterListService service;

    @Autowired
    public MasterListController(MasterListService service) {
        this.service = service;
    }

    // Save a new MasterList entry
    @PostMapping("/master_list")
    public MasterListDTO createMasterList(@RequestBody MasterListDTO dto) {
        return service.saveMasterList(dto);
    }

    // Get all MasterList entries
    @GetMapping("/master_list")
    public List<MasterListDTO> getAllMasterLists() {
        return service.getAllMasterLists();
    }
}
