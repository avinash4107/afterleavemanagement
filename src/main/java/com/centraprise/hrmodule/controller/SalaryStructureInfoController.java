package com.centraprise.hrmodule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.centraprise.hrmodule.model.FinalSalaryInfoDTO;
import com.centraprise.hrmodule.service.LeaveManagementService;

@Controller
public class SalaryStructureInfoController {

	@Autowired
	private LeaveManagementService leaveManagementService;

	@GetMapping("/finalsalaryinfo")
	public String getSalaryInfo(Model model) {
		try {
			List<FinalSalaryInfoDTO> salaryInfoDTO = leaveManagementService.getFinalSaloryInfo();
			model.addAttribute("salarystructure", salaryInfoDTO);
		} catch (Exception e) {

			e.printStackTrace();
		}

		return "salarystructure";
	}
}
