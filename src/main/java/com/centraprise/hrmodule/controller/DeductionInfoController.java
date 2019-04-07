package com.centraprise.hrmodule.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.centraprise.hrmodule.exception.CentrapriseException;
import com.centraprise.hrmodule.model.DeductionCommand;
import com.centraprise.hrmodule.model.EmployeeListDTO;
import com.centraprise.hrmodule.service.DeductionService;
import com.centraprise.hrmodule.service.EmployeeService;

@Controller
public class DeductionInfoController {
	@Autowired
	private DeductionService deductionService;

	@Autowired
	private EmployeeService employeeRepository;

	@GetMapping("/saveDeductionInfo")
	public String getDeductionInfo(Model model) {
		try {
			model.addAttribute("deductionInfoForm", new DeductionCommand());
			List<EmployeeListDTO> details = employeeRepository.getEmployeesList();
			if (details != null) {
				List<Integer> employeeNumbers = new ArrayList<>();
				for (EmployeeListDTO det : details) {
					employeeNumbers.add(det.getEmployeeId());
				}
				model.addAttribute("employeeNum", employeeNumbers);
			}
			return "deductioninfo";
		} catch (Exception e) {
			throw new CentrapriseException("Database is down");
		}
	}

	@PostMapping("/saveDeductionInfo")
	public String saveDeduction(@ModelAttribute("deductionInfoForm") DeductionCommand deductionCommand) {
		try {
			deductionService.saveDeduction(deductionCommand);
		} catch (Exception e) {

		}
		return "redirect:/employeeList";
	}

}
