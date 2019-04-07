package com.centraprise.hrmodule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.centraprise.hrmodule.model.LeaveForm;
import com.centraprise.hrmodule.model.LeavesInfoDTO;
import com.centraprise.hrmodule.model.SaloryCommand;
import com.centraprise.hrmodule.service.LeaveManagementService;

@Controller
public class LeaveManagementController {

	@Autowired
	private LeaveManagementService leaveManagementService;

	@GetMapping("/leaveInfo")
	public String leaveManagement(Model model) {
		try {
			List<LeavesInfoDTO> leavesInfo = leaveManagementService.getLeavesInfo();
			model.addAttribute("leavesInfo", leavesInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "leavemanagement";
	}

	@PostMapping("/applyLeave")
	public String applyLeave(@ModelAttribute("leaveForm") LeaveForm form, BindingResult result) {

		try {
			leaveManagementService.insertEmployeeLeavesDetails(form);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/leaveInfo";
	}

	@GetMapping("/applyLeave")
	public String applyLeavePage(Model model) {
		try {
			List<Integer> employeeNumnbers = leaveManagementService.getEmployeeList();
			model.addAttribute("employeeNum", employeeNumnbers);
			model.addAttribute("leaveForm", new LeaveForm());
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return "leaves";
	}
}
