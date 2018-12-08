package com.sgic.leavesystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.leavesystem.entity.ParAppraisers;

public interface ParAppraisersRepository extends JpaRepository<ParAppraisers,Integer>{
	public List<ParAppraisers> findByParId(Integer parId);
	public ParAppraisers findByEmpId(String empId);
}
