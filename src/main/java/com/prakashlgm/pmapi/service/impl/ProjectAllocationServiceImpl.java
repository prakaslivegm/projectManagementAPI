package com.prakashlgm.pmapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prakashlgm.pmapi.dao.ProjectAllocationDAO;
import com.prakashlgm.pmapi.model.ProjectAllocation;
import com.prakashlgm.pmapi.service.ProjectAllocationService;

@Service
public class ProjectAllocationServiceImpl implements ProjectAllocationService{

	@Autowired
	private ProjectAllocationDAO projectAllocationDAOImpl;
	
	@Override
	public ProjectAllocation createNewAllocation(ProjectAllocation projectAllocation) {
		
		return projectAllocationDAOImpl.createNewAllocation(projectAllocation);
		
	}
	
	

}
