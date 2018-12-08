package com.sgic.leavesystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.leavesystem.entity.ParSkillReport;

public interface ParSkillReportRepository extends JpaRepository<ParSkillReport,Integer>
{
	
    public ParSkillReport  findByRid(Integer rid);
    public List<ParSkillReport> findByParId(Integer rid);
}
