package com.sgic.leavesystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.leavesystem.entity.ParSkillReport;
import com.sgic.leavesystem.repository.ParSkillReportRepository;

@Service
public class ParSkillReportService {
	
@Autowired
private ParSkillReportRepository parSkillReportRepository;

		public List<ParSkillReport> getAll(Integer parId)
		{
			List<ParSkillReport> parSkillReport=new ArrayList<>();
			parSkillReportRepository.findByParId(parId)
			.forEach(parSkillReport::add);
			return parSkillReport;
		}
		
		public ParSkillReport getParSkillReport(Integer appraiserId)
		{
			return parSkillReportRepository.findByRId(appraiserId);
			
		}
		
		public void addParSkillReport(ParSkillReport parSkillReport) {
			parSkillReportRepository.save(parSkillReport);
			
		}
		
		public void updateParSkillReport(ParSkillReport parSkillReport) {
		
			parSkillReportRepository.save(parSkillReport);
		}
		
		public void deleteParSkillReport(Integer reportId) {
			parSkillReportRepository.deleteById(reportId);
			
		}

}
