package com.centraprise.hrmodule.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.centraprise.hrmodule.entity.EmployeeDetails;

@Entity
@Table(name = "assignment_info")
public class AssignmentInformation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "assignment_info_id")
	private int assignmentInfoId;

	@Column(name = "assignment_start_date")
	private String assignmentStartDate;

	@Column(name = "assignment_end_date")
	private String assignmentEndDate;

	private String job;

	@Column(name = "date_of_joining")
	private String dateOfJoining;

	@Column(name = "years_of_service")
	private float yearsOfService;

	private String manager;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_id", unique = true)
	private EmployeeDetails employeeDetails;

	public int getAssignmentInfoId() {
		return assignmentInfoId;
	}

	public void setAssignmentInfoId(int assignmentInfoId) {
		this.assignmentInfoId = assignmentInfoId;
	}

	public String getAssignmentStartDate() {
		return assignmentStartDate;
	}

	public void setAssignmentStartDate(String assignmentStartDate) {
		this.assignmentStartDate = assignmentStartDate;
	}

	public String getAssignmentEndDate() {
		return assignmentEndDate;
	}

	public void setAssignmentEndDate(String assignmentEndDate) {
		this.assignmentEndDate = assignmentEndDate;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public float getYearsOfService() {
		return yearsOfService;
	}

	public void setYearsOfService(float yearsOfService) {
		this.yearsOfService = yearsOfService;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

}
