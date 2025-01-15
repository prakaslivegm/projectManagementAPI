package com.prakashlgm.pmapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prakashlgm.pmapi.dao.EmployeeDAO;
import com.prakashlgm.pmapi.model.Employee;
import com.prakashlgm.pmapi.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO employeeDAOImpl;
	
	@Override
	public Employee createEmployee(Employee employee) {
		
		return employeeDAOImpl.createNewEmployee(employee);
		
	}
	
	

}
