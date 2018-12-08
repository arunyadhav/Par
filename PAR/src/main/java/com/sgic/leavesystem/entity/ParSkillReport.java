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

	@OneToMany(mappedBy = "parSkillReport",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JsonIgnore
	private List<ParSkillsScore> parSkillsScore;
	
	@ManyToOne
	@JoinColumn(name= "par_id")
	private Par par;

	public ParSkillReport(Integer rId, Date parDate, Integer appraiserId,Integer parId) {

		this.rId = rId;
		this.parDate = parDate;
		this.appraiserId = appraiserId;
        this.par=new Par(parId,new Date());
	}

	public ParSkillReport() {

	}

	public Integer getReportId() {
		return rId;
	}

	public void setReportId(Integer rid) {
		this.rId = rid;
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

	public List<ParSkillsScore> getParSkillsScore() {
		return parSkillsScore;
	}

	public void setParSkillsScore(List<ParSkillsScore> parSkillsScore) {
		this.parSkillsScore = parSkillsScore;
	}



}
