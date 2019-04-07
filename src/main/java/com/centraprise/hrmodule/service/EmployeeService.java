package com.centraprise.hrmodule.service;

import java.util.List;

import com.centraprise.hrmodule.model.EmployeeCommand;
import com.centraprise.hrmodule.model.EmployeeInfoListDTO;
import com.centraprise.hrmodule.model.EmployeeListDTO;

public interface EmployeeService {

	List<EmployeeListDTO> getEmployeesList();

	void saveEmployee(EmployeeCommand employeeDetails);

	EmployeeInfoListDTO getEmployeeById(int employeenumber);

	void updateEmployee(EmployeeCommand employeeCommand) throws Exception;

	void deleteEmployeeById(int employeeId);
}
