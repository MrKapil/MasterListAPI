package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.MasterList;

public interface MasterListRepository extends JpaRepository<MasterList, Long> {
}



