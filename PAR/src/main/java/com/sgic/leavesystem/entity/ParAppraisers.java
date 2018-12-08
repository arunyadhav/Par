package com.sgic.leavesystem.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ParAppraisers {

	@Id
	private Integer appraiserId;
	private String empId;
	
	@ManyToOne
	@JoinColumn(name ="par_id")
	private Par par;
	
	public ParAppraisers() {
	}
	
	public ParAppraisers(Integer appraiserId, String empId,Integer parId) {
		this.appraiserId = appraiserId;
		empId = empId;
		this.par=new Par(parId,new Date());
	}

	public Par getPar() {
		return par;
	}

	public void setPar(Par par) {
		this.par = par;
	}

	
	public Integer getAppraiserId() {
		return appraiserId;
	}
	public void setAppraiserId(Integer appraiserId) {
		this.appraiserId = appraiserId;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		empId = empId;
	}
	
	
}
