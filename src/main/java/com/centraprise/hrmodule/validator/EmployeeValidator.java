package com.centraprise.hrmodule.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.centraprise.hrmodule.model.EmployeeCommand;
import com.centraprise.hrmodule.util.ValidationUtil;

@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		if (clazz.isAssignableFrom(EmployeeCommand.class)) {
			return true;
		}
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		EmployeeCommand employeeDetails = (EmployeeCommand) target;
		Pattern pattern = Pattern.compile("[A-Za-z]{5}[0-9]{4}[A-Za-z]{1}");
		Matcher matcher = pattern.matcher(employeeDetails.getPan());
		if (matcher.matches() == false) {
			errors.rejectValue("pan", "employeedetails.pannumber.empty");
		}
		Pattern pattern1 = Pattern.compile("\\d{10}");
		Matcher matcher1 = pattern1.matcher(employeeDetails.getPhone());
		if (matcher1.matches() == false) {
			errors.rejectValue("phone", "employeedetails.phone.empty");
		}
		Pattern pattern2 = Pattern.compile("\\d{6}");
		Matcher matcher3 = pattern2.matcher(employeeDetails.getPin());
		if (matcher3.matches() == false) {
			errors.rejectValue("pin", "employeedetails.pin.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getCountry())) {
			errors.rejectValue("country", "employeedetails.country.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getMandal())) {
			errors.rejectValue("mandal", "employeedetails.mandal.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getState())) {
			errors.rejectValue("state", "employeedetails.state.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getDistrict())) {
			errors.rejectValue("district", "employeedetails.district.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getVlg())) {
			errors.rejectValue("vlg", "employeedetails.village.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getDoornum())) {
			errors.rejectValue("doornum", "employeedetails.doornum.empty");
		}
		if (ValidationUtil.isEmpty(String.valueOf(employeeDetails.getEmployeenumber()))) {
			errors.rejectValue("employeenumber", "employeedetails.employeenumber.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getName())) {
			errors.rejectValue("name", "employeedetails.name.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getAccountnumber())) {
			errors.rejectValue("accountnumber", "employeedetails.accountnumber.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getGender())) {
			errors.rejectValue("gender", "employeedetails.gender.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getBday())) {
			errors.rejectValue("bday", "employeedetails.bday.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getBankname())) {
			errors.rejectValue("bankname", "employeedetails.bankname.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getIfsc())) {
			errors.rejectValue("ifsc", "employeedetails.ifsc.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getUan())) {
			errors.rejectValue("uan", "employeedetails.uan.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getAdhar())) {
			errors.rejectValue("adhar", "employeedetails.adhar.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getMaritalstatus())) {
			errors.rejectValue("maritalstatus", "employeedetails.maritalstatus.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getEmail())) {
			errors.rejectValue("email", "employeedetails.email.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getStartdate())) {
			errors.rejectValue("startdate", "employeedetails.startdate.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getEndDate())) {
			errors.rejectValue("endDate", "employeedetails.endDate.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getJoindate())) {
			errors.rejectValue("joindate", "employeedetails.joindate.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getJob())) {
			errors.rejectValue("job", "employeedetails.job.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getManager())) {
			errors.rejectValue("manager", "employeedetails.manager.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getPreviousemp())) {
			errors.rejectValue("previousemp", "employeedetails.previousemp.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getPreviousempenddate())) {
			errors.rejectValue("previousempenddate", "employeedetails.previousempenddate.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getPreviousempleavingdate())) {
			errors.rejectValue("previousempleavingdate", "employeedetails.previousempleavingdate.empty");
		}
		if (ValidationUtil.isEmpty(employeeDetails.getPreviousempstartdate())) {
			errors.rejectValue("previousempleavingdate", "employeedetails.previousempstartdate.empty");
		}
		if (ValidationUtil.isEmpty(String.valueOf(employeeDetails.getService()))) {
			errors.rejectValue("service", "employeedetails.service.empty");
		}
	}

}
