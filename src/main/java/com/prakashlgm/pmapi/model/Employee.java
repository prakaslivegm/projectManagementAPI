package com.prakashlgm.pmapi.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empSysId;
	private String empId;
	private String empName;
	private String capbCenter;
	private Date doj;
	private String designation;
	private String primarySkill;
	private String secSkill;
	private int overallExp;
	private int projCount;
	
	
	public Employee(int empSysId, String empId, String empName, String capbCenter, Date doj, String designation,
			String primarySkill, String secSkill, int overallExp, int projCount) {
		super();
		this.empSysId = empSysId;
		this.empId = empId;
		this.empName = empName;
		this.capbCenter = capbCenter;
		this.doj = doj;
		this.designation = designation;
		this.primarySkill = primarySkill;
		this.secSkill = secSkill;
		this.overallExp = overallExp;
		this.projCount = projCount;
	}


	public int getEmpSysId() {
		return empSysId;
	}


	public void setEmpSysId(int empSysId) {
		this.empSysId = empSysId;
	}


	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getCapbCenter() {
		return capbCenter;
	}


	public void setCapbCenter(String capbCenter) {
		this.capbCenter = capbCenter;
	}


	public Date getDoj() {
		return doj;
	}


	public void setDoj(Date doj) {
		this.doj = doj;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getPrimarySkill() {
		return primarySkill;
	}


	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}


	public String getSecSkill() {
		return secSkill;
	}


	public void setSecSkill(String secSkill) {
		this.secSkill = secSkill;
	}


	public int getOverallExp() {
		return overallExp;
	}


	public void setOverallExp(int overallExp) {
		this.overallExp = overallExp;
	}


	public int getProjCount() {
		return projCount;
	}


	public void setProjCount(int projCount) {
		this.projCount = projCount;
	}


	@Override
	public String toString() {
		return "Employee [empSysId=" + empSysId + ", empId=" + empId + ", empName=" + empName + ", capbCenter="
				+ capbCenter + ", doj=" + doj + ", designation=" + designation + ", primarySkill=" + primarySkill
				+ ", secSkill=" + secSkill + ", overallExp=" + overallExp + ", projCount=" + projCount + "]";
	}
	
	
	


}
