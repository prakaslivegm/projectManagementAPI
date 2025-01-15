package com.prakashlgm.pmapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakashlgm.pmapi.model.Employee;

public interface EmployeeRespositroy extends JpaRepository<Employee, Integer>{

}
