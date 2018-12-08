package com.sgic.leavesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.leavesystem.entity.ParSkillReport;
import com.sgic.leavesystem.service.ParSkillReportService;

@RestController
public class ParSkillReportController {

	@Autowired
	private ParSkillReportService parSkillReportService;
	
	@GetMapping("/par/{parId}/parskill")
	public List<ParSkillReport> getAll(@PathVariable Integer parId)
	{
		return parSkillReportService.getAll(parId);
	}
	@GetMapping("/par/{parId}/parskill/{empId}")
	public ParSkillReport getParSkillReport(@PathVariable Integer parId,@PathVariable Integer appraiserId)
	{
		return parSkillReportService.getParSkillReport(appraiserId);
	}
	
	@PostMapping("/par/{parId}/parskill")
	public void addParSkillReport(@RequestBody ParSkillReport parSkillReport,@PathVariable Integer parId)
	{
//		parSkillReport.setPar(new Par(parId,new Date()));
		parSkillReportService.addParSkillReport(parSkillReport);
		
	}
	@PutMapping("/par/{parId}/parskill/{id}")
	public void updateParSkillReport(@RequestBody ParSkillReport parSkillReport, @PathVariable Integer parId,@PathVariable Integer id )
	{
//		parSkillReport.set
		parSkillReportService.updateParSkillReport(parSkillReport);
		
	}
	@DeleteMapping("/par/{id}/parskill/{id}")
	public void deleteParSkillReport(@PathVariable Integer id)
	{
		parSkillReportService.deleteParSkillReport(id);
	}

}
