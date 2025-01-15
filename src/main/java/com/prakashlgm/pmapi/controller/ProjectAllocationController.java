package com.prakashlgm.pmapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prakashlgm.pmapi.model.ProjectAllocation;
import com.prakashlgm.pmapi.response.ResponseHandler;
import com.prakashlgm.pmapi.service.ProjectAllocationService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class ProjectAllocationController {
	@Autowired
	private ProjectAllocationService service;
	

	@PostMapping("/createNewAllocation")
	public ResponseEntity<Object> createNewProjectAllocation(@RequestBody ProjectAllocation projectAllocation) {
		
		projectAllocation = service.createNewAllocation(projectAllocation);
		
		return ResponseHandler.responseBuilder("Allocation created successfully for the Employee", HttpStatus.CREATED, projectAllocation);
		
		
	}
	
	

}
