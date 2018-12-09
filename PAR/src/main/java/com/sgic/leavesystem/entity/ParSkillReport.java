package com.sgic.leavesystem.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ParSkillReport {
	@Id
	private Integer rId;
	private Date parDate;
	private Integer appraiserId;

//	 @OneToMany(cascade = CascadeType.ALL,mappedBy = "parSkillReport",fetch=FetchType.EAGER)
//	 @JsonIgnore
//	private List<ParSkillsScore> parSkillsScore;
	
	@ManyToOne
	@JoinColumn(name= "par_id")
	private Par par;
	
	
	

	public ParSkillReport(Integer rId, Date parDate, Integer appraiserId,Integer parId) {
		super();
		this.rId = rId;
		this.parDate = parDate;
		this.appraiserId = appraiserId;
		this.par = new Par(parId,new Date());
	}

	public Integer getrId() {
		return rId;
	}

	public void setrId(Integer rId) {
		this.rId = rId;
	}

	public Date getParDate() {
		return parDate;
	}

	public void setParDate(Date parDate) {
		this.parDate = parDate;
	}

	public Integer getAppraiserId() {
		return appraiserId;
	}

	public void setAppraiserId(Integer appraiserId) {
		this.appraiserId = appraiserId;
	}

	

	public Par getPar() {
		return par;
	}

	public void setPar(Par par) {
		this.par = par;
	}

	

}
