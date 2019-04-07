package com.centraprise.hrmodule.model;

public class LeaveForm {

	private String employeenumber;
	private String startDate;
	private String endDate;
	private String numberofdays;
	private String leaveType;
	private String Month_list;

	public String getEmployeenumber() {
		return employeenumber;
	}

	public void setEmployeenumber(String employeenumber) {
		this.employeenumber = employeenumber;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getNumberofdays() {
		return numberofdays;
	}

	public void setNumberofdays(String numberofdays) {
		this.numberofdays = numberofdays;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getMonth_list() {
		return Month_list;
	}

	public void setMonth_list(String month_list) {
		Month_list = month_list;
	}

	@Override
	public String toString() {
		return "LeaveForm [employeenumber=" + employeenumber + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", numberofdays=" + numberofdays + ", leaveType=" + leaveType + ", Month_list=" + Month_list + "]";
	}

}
