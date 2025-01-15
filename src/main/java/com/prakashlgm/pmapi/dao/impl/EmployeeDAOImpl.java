package com.prakashlgm.pmapi.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prakashlgm.pmapi.Repository.EmployeeRespositroy;
import com.prakashlgm.pmapi.dao.EmployeeDAO;
import com.prakashlgm.pmapi.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	@Autowired
	EmployeeRespositroy employeeRepo;
	
	@Override
	public Employee createNewEmployee(Employee employee) {
		
		employee = employeeRepo.save(employee);
		
		return employee;
		
	}

}
