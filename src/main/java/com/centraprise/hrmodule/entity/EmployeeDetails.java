package com.centraprise.hrmodule.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int empId;
	@Column(name = "emp_number", unique = true)
	private int employeeNumber;
	@Column(name = "emp_name")
	private String employeeName;
	@Column(name = "gender")
	private String sex;
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	@Column(name = "pan_number")
	private String panNumber;
	@Column(name = "marital_status")
	private String maritalStatus;
	@Column(name = "email_address", unique = true)
	private String emailAddress;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "password")
	private String password;

	@Column(name = "active")
	private boolean employeeActive;

	@OneToMany(targetEntity = EmployeeAddress.class, mappedBy = "employeeDetails", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<EmployeeAddress> address;

	@OneToMany(targetEntity = AssignmentInformation.class, mappedBy = "employeeDetails", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<AssignmentInformation> assignmentInfo;

	@OneToMany(targetEntity = BankInformation.class, mappedBy = "employeeDetails", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<BankInformation> bankInfo;

	@OneToMany(targetEntity = ProvidentFundInformation.class, mappedBy = "employeeDetails", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<ProvidentFundInformation> providentInfo;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<EmployeeAddress> getAddress() {
		return address;
	}

	public void setAddress(Set<EmployeeAddress> address) {
		this.address = address;
	}

	public Set<AssignmentInformation> getAssignmentInfo() {
		return assignmentInfo;
	}

	public void setAssignmentInfo(Set<AssignmentInformation> assignmentInfo) {
		this.assignmentInfo = assignmentInfo;
	}

	public Set<BankInformation> getBankInfo() {
		return bankInfo;
	}

	public void setBankInfo(Set<BankInformation> bankInfo) {
		this.bankInfo = bankInfo;
	}

	public Set<ProvidentFundInformation> getProvidentInfo() {
		return providentInfo;
	}

	public void setProvidentInfo(Set<ProvidentFundInformation> providentInfo) {
		this.providentInfo = providentInfo;
	}

	public boolean isEmployeeActive() {
		return employeeActive;
	}

	public void setEmployeeActive(boolean employeeActive) {
		this.employeeActive = employeeActive;
	}

}
