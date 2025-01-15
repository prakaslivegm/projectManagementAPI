package com.prakashlgm.pmapi.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prakashlgm.pmapi.Repository.ProjectAllocationRepositroy;
import com.prakashlgm.pmapi.dao.ProjectAllocationDAO;
import com.prakashlgm.pmapi.model.ProjectAllocation;

@Repository
public class ProjectAllocationDAOImpl implements ProjectAllocationDAO{

	@Autowired
	ProjectAllocationRepositroy projAllocationRepo;
	
	@Override
	public ProjectAllocation createNewAllocation(ProjectAllocation projectAllocation) {
		
		 projectAllocation = projAllocationRepo.save(projectAllocation);
		
		return projectAllocation;
	}

	
}
