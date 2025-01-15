package com.prakashlgm.pmapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProjectAllocation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int allocationid;
	private int accId;
	private int projId;
	private String empId;
	
	public ProjectAllocation(int accId, int projId, String empSysId) {
		super();
		
		this.accId = accId;
		this.projId = projId;
		this.empId = empSysId;
	}

	public int getAllocationid() {
		return allocationid;
	}

	public void setAllocationid(int allocationid) {
		this.allocationid = allocationid;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empSysId) {
		this.empId = empSysId;
	}

	@Override
	public String toString() {
		return "ProjectAllocation [allocationid=" + allocationid + ", accId=" + accId + ", projId=" + projId
				+ ", empId=" + empId + "]";
	}
	
	

}
