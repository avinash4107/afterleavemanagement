package com.centraprise.hrmodule.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.centraprise.hrmodule.exception.CentrapriseException;
import com.centraprise.hrmodule.model.EmployeeListDTO;
import com.centraprise.hrmodule.model.SaloryCommand;
import com.centraprise.hrmodule.model.SaloryInfoListDTO;
import com.centraprise.hrmodule.service.EmployeeService;
import com.centraprise.hrmodule.service.SalaryService;

@Controller
public class SaveSalaryController {

	Map<String, Object> saloryInfo = null;

	@Autowired
	private SalaryService saloryService;

	@Autowired
	private EmployeeService employeeRepository;

	@GetMapping("/saveSaloryInfo")
	public String getSaloryPage(Model model) {
		model.addAttribute("salaryInfo", new SaloryCommand());
		try {
			List<EmployeeListDTO> details = employeeRepository.getEmployeesList();
			if (details != null) {
				List<Integer> employeeNumbers = new ArrayList<>();
				for (EmployeeListDTO det : details) {
					employeeNumbers.add(det.getEmployeeId());
				}
				model.addAttribute("employees", employeeNumbers);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new CentrapriseException("Database is down");
		}
		return "salarydetails";
	}

	@PostMapping("/saveSaloryInfo")
	public String saveSalory(@ModelAttribute("salaryInfo") SaloryCommand saloryCommand, Model model) {
		try {
			saloryService.saveSaloryInfo(saloryCommand);
			return "redirect:/salarystructure";
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	@GetMapping("/salarystructure")
	public String getSaloryInfo(Model model) {
		try {
			List<SaloryInfoListDTO> saloryInfoListDTOs = saloryService.getSaloryInfoList();
			model.addAttribute("saloryStructure", saloryInfoListDTOs);
			return "monthendprocess";
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

}
