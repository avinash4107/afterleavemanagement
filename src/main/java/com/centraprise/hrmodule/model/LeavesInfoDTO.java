package com.centraprise.hrmodule.model;

public class LeavesInfoDTO {

	private int id;
	private int employeeNumber;
	private String leaveStartDate;
	private String leaveEndDate;
	private String leaveType;
	private float numberOfdays;
	private String month;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getLeaveStartDate() {
		return leaveStartDate;
	}

	public void setLeaveStartDate(String leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}

	public String getLeaveEndDate() {
		return leaveEndDate;
	}

	public void setLeaveEndDate(String leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public float getNumberOfdays() {
		return numberOfdays;
	}

	public void setNumberOfdays(float numberOfdays) {
		this.numberOfdays = numberOfdays;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "LeavesInfoDTO [id=" + id + ", employeeNumber=" + employeeNumber + ", leaveStartDate=" + leaveStartDate
				+ ", leaveEndDate=" + leaveEndDate + ", leaveType=" + leaveType + ", numberOfdays=" + numberOfdays
				+ ", month=" + month + "]";
	}

}
