package com.centraprise.hrmodule.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.centraprise.hrmodule.exception.DatabaseException;
import com.centraprise.hrmodule.model.EmployeeCommand;
import com.centraprise.hrmodule.model.EmployeeInfoListDTO;
import com.centraprise.hrmodule.model.EmployeeListDTO;
import com.centraprise.hrmodule.service.EmployeeService;
import com.centraprise.hrmodule.validator.EmployeeValidator;

@Controller
@PreAuthorize("hasAnyRole('ADMIN')")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private EmployeeValidator employeeValidator;

	@RequestMapping("/emp")
	public String getEmp() {
		return "redirect:/employeeList";
	}

	@RequestMapping("/employeeList")
	public String getEmployeeList(Model model, HttpServletRequest request) {
		List<EmployeeListDTO> employeeDetails = null;
		try {
			employeeDetails = employeeService.getEmployeesList();
			if (employeeDetails != null) {
				model.addAttribute("employees", employeeDetails);
			}
		} catch (DatabaseException e) {
		} catch (Exception e) {
		}
		return "employee";
	}

	@GetMapping("/addemployee")
	public String getNewEmployeeForm(Model model) {
		model.addAttribute("employeeForm", new EmployeeCommand());
		return "addEmployee";
	}

	@PostMapping("/addemployee")
	public String addNewEmployee(@ModelAttribute("employeeForm") EmployeeCommand employeeDetails,
			BindingResult result) {
		try {
			if (employeeValidator.supports(employeeDetails.getClass())) {
				employeeValidator.validate(employeeDetails, result);
				if (result.hasErrors()) {
					return "addEmployee";
				}
				employeeService.saveEmployee(employeeDetails);
			}
		} catch (DatabaseException e) {

		} catch (Exception e) {

		}
		return "redirect:/employeeList";
	}

	@GetMapping("/employeeInfo/{employeeid}")
	public String getEmployeeInfo(Model model, @PathVariable("employeeid") int employeeNumber) {
		EmployeeInfoListDTO employeeListDTO = null;
		try {
			employeeListDTO = employeeService.getEmployeeById(employeeNumber);
			model.addAttribute("command", employeeListDTO);
		} catch (Exception e) {

		}
		return "employeeinfo";
	}

	@GetMapping("/updateEmployee/{employeeid}")
	public String getUpdateEmployeeInfo(Model model, @PathVariable("employeeid") int employeeNumber) {
		EmployeeInfoListDTO employeeListDTO = null;
		try {
			employeeListDTO = employeeService.getEmployeeById(employeeNumber);
			model.addAttribute("command", employeeListDTO);
		} catch (Exception e) {

		}
		return "updateEmployee";
	}

	@PostMapping("/updateEmployee")
	public String updateEmployee(@ModelAttribute("command") EmployeeCommand employeeCommand, BindingResult result) {

		try {
			if (employeeValidator.supports(employeeCommand.getClass())) {
				employeeValidator.validate(employeeCommand, result);
				if (result.hasErrors()) {
					return "updateEmployee";
				}
				employeeService.updateEmployee(employeeCommand);
			}
		} catch (Exception e) {
			return "";
		}
		return "redirect:/employeeList";
	}

	@GetMapping("/delete/{empId}")
	public String deleteEmployee(@PathVariable("empId") int empId) {

		try {
			employeeService.deleteEmployeeById(empId);
		} catch (Exception e) {
			return "not done";
		}
		return "redirect:/employeeList";
	}
}
