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

import com.sgic.leavesystem.entity.Par;
import com.sgic.leavesystem.service.ParService;

@RestController
public class ParController {
	
	@Autowired
	private ParService parService;
	
	@GetMapping("/par")
	public List<Par> getAll()
	{
		return parService.getAll();
	}
	@GetMapping("/par/{id}")
	public Par getPar(@PathVariable Integer id)
	{
		return parService.getPar(id);
	}
	
	@PostMapping("/par")
	public void addPar(@RequestBody Par par)
	{
		parService.addPar(par);
		
	}
	@PutMapping("/par/{id}")
	public void addTopic(@RequestBody Par par, @PathVariable Integer id)
	{
		parService.updatePar(id, par);
		
	}
	@DeleteMapping("/par/{id}")
	public void deletePar(@PathVariable Integer id)
	{
		 parService.deletePar(id);
	}

	
//	@GetMapping("/")
//	public Par getParTemplate() {
//		Par par = new Par();
//		par.setId(1);
//		par.setScheduleDate(new Date());
//
//		List<ParAppraisers> parAppraisersList = new ArrayList<ParAppraisers>();
//		parAppraisersList.add(new ParAppraisers(1, "EMP001"));
//		parAppraisersList.add(new ParAppraisers(1, "EMP002"));
//
//		ParSkillReport parskillreport1 = new ParSkillReport();
//		parskillreport1.setReportId(1);
//		parskillreport1.setParDate(new Date());
//		parskillreport1.setAppraiserId(1);
//		List<ParSkillsScore> parSkillsScoreListForReport1 = new ArrayList<ParSkillsScore>();
//		parSkillsScoreListForReport1.add(new ParSkillsScore("sk001", 3));
//		parSkillsScoreListForReport1.add(new ParSkillsScore("sk002", 2));
//		parskillreport1.setParSkillsScore(parSkillsScoreListForReport1);
//
//		ParSkillReport parskillreport2 = new ParSkillReport(2,new Date(),2);
//		List<ParSkillsScore> parSkillsScoreListForReport2 = new ArrayList<ParSkillsScore>();
//		parSkillsScoreListForReport2.add(new ParSkillsScore("sk001", 2));
//		parSkillsScoreListForReport2.add(new ParSkillsScore("sk002", 3));
//		parskillreport2.setParSkillsScore(parSkillsScoreListForReport2);
//
//		List<ParSkillReport> parSkillReportList = new ArrayList<ParSkillReport>();
//		parSkillReportList.add(parskillreport1);
//		parSkillReportList.add(parskillreport2);
//
//		par.setParSkillReport(parSkillReportList);
//		par.setParAppraisers(parAppraisersList);
//
//		return par;
//		
//		
//	}

}
