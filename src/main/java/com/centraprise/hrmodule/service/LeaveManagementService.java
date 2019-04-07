package com.centraprise.hrmodule.service;

import java.util.List;

import com.centraprise.hrmodule.model.FinalSalaryInfoDTO;
import com.centraprise.hrmodule.model.LeaveForm;
import com.centraprise.hrmodule.model.LeavesInfoDTO;

public interface LeaveManagementService {

	List<LeavesInfoDTO> getLeavesInfo();

	List<Integer> getEmployeeList();

	void insertEmployeeLeavesDetails(LeaveForm leaveForm);
	
	List<FinalSalaryInfoDTO> getFinalSaloryInfo();

}
