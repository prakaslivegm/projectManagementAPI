package com.prakashlgm.pmapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.prakashlgm.pmapi.model.Employee;
import com.prakashlgm.pmapi.response.ResponseHandler;
import com.prakashlgm.pmapi.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	

	@PostMapping("/createNewEmployee")
	public ResponseEntity<Object> createNewEmployee(@RequestBody Employee employee) {
		
		employee = service.createEmployee(employee);
		
		return ResponseHandler.responseBuilder("Employee created successfully", HttpStatus.CREATED, employee);
		
		
	}

}
