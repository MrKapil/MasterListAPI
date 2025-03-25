package com.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.MasterListDTO;
import com.demo.model.MasterList;
import com.demo.repository.MasterListRepository;

@Service
public class MasterListService {

    private final MasterListRepository repository;

    @Autowired
    public MasterListService(MasterListRepository repository) {
        this.repository = repository;
    }

    // Create or update a MasterList entry
    public MasterListDTO saveMasterList(MasterListDTO dto) {
        MasterList entity = new MasterList(dto.getParentCode(), dto.getParentName(), dto.getName());
        MasterList savedEntity = repository.save(entity);
        return new MasterListDTO(savedEntity.getParentCode(), savedEntity.getParentName(), savedEntity.getName());
    }

    // Get all MasterList records
    public List<MasterListDTO> getAllMasterLists() {
        return repository.findAll().stream()
                .map(m -> new MasterListDTO(m.getParentCode(), m.getParentName(), m.getName()))
                .collect(Collectors.toList());
    }
}
