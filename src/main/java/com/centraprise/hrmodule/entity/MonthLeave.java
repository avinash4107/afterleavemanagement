package com.centraprise.hrmodule.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "month_leave_info")
public class MonthLeave {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "month_leave_info_id")
	private int monthLeaveInfoId;

	private String month;

	@Column(name = "number_of_days_taken_leave")
	private float numberOfDaysLeave;

	@Column(name = "leave_start_date")
	private String leaveStartDate;

	@Column(name = "leave_end_date")
	private String leaveEndDate;

	@Column(name = "leave_type")
	private String leaveType;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "leave_info_id")
	private ManageLeave manageLeave;

	public int getMonthLeaveInfoId() {
		return monthLeaveInfoId;
	}

	public void setMonthLeaveInfoId(int monthLeaveInfoId) {
		this.monthLeaveInfoId = monthLeaveInfoId;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public float getNumberOfDaysLeave() {
		return numberOfDaysLeave;
	}

	public void setNumberOfDaysLeave(float numberOfDaysLeave) {
		this.numberOfDaysLeave = numberOfDaysLeave;
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

	public ManageLeave getManageLeave() {
		return manageLeave;
	}

	public void setManageLeave(ManageLeave manageLeave) {
		this.manageLeave = manageLeave;
	}

}
