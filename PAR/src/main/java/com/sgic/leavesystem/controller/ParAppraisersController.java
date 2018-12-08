package com.sgic.leavesystem.controller;

import java.util.Date;
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
import com.sgic.leavesystem.entity.ParAppraisers;
import com.sgic.leavesystem.service.ParAppraisersService;

@RestController
public class ParAppraisersController {

	@Autowired
	private ParAppraisersService parAppraisersService;
	
	@GetMapping("/par/{parId}/parapp")
	public List<ParAppraisers> getAll(@PathVariable Integer parId)
	{
		return parAppraisersService.getAll(parId);
	}
	@GetMapping("/par/{parId}/parApp/{empId}")
	public ParAppraisers getParAppraisers(@PathVariable Integer parId,@PathVariable String appraiserId)
	{
		return parAppraisersService.getParAppraisers(appraiserId);
	}
	
	@PostMapping("/par/{parId}/parApp")
	public void addParAppraisers(@RequestBody ParAppraisers parAppraisers,@PathVariable Integer parId)
	{
		parAppraisers.setPar(new Par(parId,new Date()));
		parAppraisersService.addParAppraisers(parAppraisers);
		
	}
	@PutMapping("/par/{parId}/parApp/{id}")
	public void updateParAppraisers(@RequestBody ParAppraisers parAppraisers, @PathVariable Integer parId,@PathVariable Integer id )
	{
		parAppraisers.setPar(new Par(parId,new Date()));
		parAppraisersService.updateParAppraisers(parAppraisers);
		
	}
	@DeleteMapping("/par/{id}/parApp/{id}")
	public void deleteParAppraisers(@PathVariable Integer id)
	{
		parAppraisersService.deleteParAppraisers(id);
	}

	
}
