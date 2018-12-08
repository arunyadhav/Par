package com.sgic.leavesystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.leavesystem.entity.Par;
import com.sgic.leavesystem.repository.ParRepository;

@Service
public class ParService {
	
@Autowired
private ParRepository parRepository;

		public List<Par> getAll()
		{
			List<Par> par=new ArrayList<>();
			parRepository.findAll()
			.forEach(par::add);
			return par;
		}
		
		public Par getPar(Integer id)
		{
			return parRepository.findParById(id);
			
		}
		
		public void addPar(Par par) {
			parRepository.save(par);
			
		}
		
		public void updatePar(Integer id,Par par) {
		
			parRepository.save(par);
		}
		
		public void deletePar(Integer id) {
			parRepository.deleteById(id);
			
		}

}
