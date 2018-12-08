package com.sgic.leavesystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.leavesystem.entity.ParAppraisers;
import com.sgic.leavesystem.repository.ParAppraisersRepository;


@Service
public class ParAppraisersService {
	
@Autowired
private ParAppraisersRepository parAppraiserRepository;

		public List<ParAppraisers> getAll(Integer parId)
		{
			List<ParAppraisers> parAppraisers=new ArrayList<>();
			parAppraiserRepository.findByParId(parId)
			.forEach(parAppraisers::add);
			return parAppraisers;
		}
		
		public ParAppraisers getParAppraisers(String empId)
		{
			return parAppraiserRepository.findByEmpId(empId);
			
		}
		
		public void addParAppraisers(ParAppraisers parAppraisers) {
			parAppraiserRepository.save(parAppraisers);
			
		}
		
		public void updateParAppraisers(ParAppraisers parAppraisers) {
		
			parAppraiserRepository.save(parAppraisers);
		}
		
		public void deleteParAppraisers(Integer appraiserId) {
			parAppraiserRepository.deleteById(appraiserId);
			
		}

		

}
