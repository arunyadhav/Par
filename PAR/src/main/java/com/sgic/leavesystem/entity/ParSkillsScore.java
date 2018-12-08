package com.sgic.leavesystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ParSkillsScore {
	@Id
	private Integer id;
	private String skillsId;
	private Integer skillsScore;

	@ManyToOne
	@JoinColumn(name = "parSkillReport_reportId")
	private ParSkillReport parSkillReport;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ParSkillReport getParSkillReport() {
		return parSkillReport;
	}

	public void setParSkillReport(ParSkillReport parSkillReport) {
		this.parSkillReport = parSkillReport;
	}

	public ParSkillsScore(String skillsId, Integer skillsScore) {

		this.skillsId = skillsId;
		this.skillsScore = skillsScore;
	}

	public ParSkillsScore() {

	}

	public String getSkillsId() {
		return skillsId;
	}

	public void setSkillsId(String skillsId) {
		this.skillsId = skillsId;
	}

	public Integer getSkillsScore() {
		return skillsScore;
	}

	public void setSkillsScore(Integer skillsScore) {
		this.skillsScore = skillsScore;
	}

}
