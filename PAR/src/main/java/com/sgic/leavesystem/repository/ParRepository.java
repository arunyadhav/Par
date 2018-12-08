package com.sgic.leavesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.leavesystem.entity.Par;

public interface ParRepository extends JpaRepository<Par, Integer> {
	
      public Par findParById(Integer id);
}
