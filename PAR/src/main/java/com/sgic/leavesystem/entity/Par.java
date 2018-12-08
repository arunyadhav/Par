package com.sgic.leavesystem.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Par {

	@Id
	private Integer id;
	private Date scheduleDate;
    
		public Par() {
				
			}
	
	public Par(Integer id, Date scheduleDate) {
		
		this.id = id;
		this.scheduleDate = scheduleDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}



}
