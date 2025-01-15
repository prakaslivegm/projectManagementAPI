package com.prakashlgm.pmapi.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Project {
	@Id
	private int accId;
	private String accName;
	private String projName;
	private int projId;
	private float allocation;
	private Date projStartDate;
	private Date projEndDate;
	private String remark;
	
	public Project(int accId, String accName, String projName, int projId, float allocation, Date projStartDate,
			Date projEndDate, String remark) {
		super();
		this.accId = accId;
		this.accName = accName;
		this.projName = projName;
		this.projId = projId;
		this.allocation = allocation;
		this.projStartDate = projStartDate;
		this.projEndDate = projEndDate;
		this.remark = remark;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}

	public float getAllocation() {
		return allocation;
	}

	public void setAllocation(float allocation) {
		this.allocation = allocation;
	}

	public Date getProjStartDate() {
		return projStartDate;
	}

	public void setProjStartDate(Date projStartDate) {
		this.projStartDate = projStartDate;
	}

	public Date getProjEndDate() {
		return projEndDate;
	}

	public void setProjEndDate(Date projEndDate) {
		this.projEndDate = projEndDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Project [accId=" + accId + ", accName=" + accName + ", projName=" + projName + ", projId=" + projId
				+ ", allocation=" + allocation + ", projStartDate=" + projStartDate + ", projEndDate=" + projEndDate
				+ ", remark=" + remark + "]";
	}
	
	

	
}
