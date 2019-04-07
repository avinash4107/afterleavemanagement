package com.centraprise.hrmodule.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centraprise.hrmodule.entity.EmployeeDetails;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Integer> {

	EmployeeDetails findByEmpIdAndEmployeeActive(int employeenumber, boolean employeeActive);
	
	List<EmployeeDetails> findByEmployeeActive(boolean employeeActive);

//	@Query("update EmployeeDetails e set e.employeeActive='false' where e.empId = :empId")
//	int  updateByEmpId(int empId);

}
