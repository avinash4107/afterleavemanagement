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
@Table(name = "employee_leave_info")
public class ManageLeave {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "leave_info_id")
	private int leaveInfoId;
	@Column(name = "employee_number", unique = true)
	private int employeeNumber;

	@OneToMany(mappedBy = "manageLeave", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<MonthLeave> monthLeavesInfo;

	public int getLeaveInfoId() {
		return leaveInfoId;
	}

	public void setLeaveInfoId(int leaveInfoId) {
		this.leaveInfoId = leaveInfoId;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public Set<MonthLeave> getMonthLeavesInfo() {
		return monthLeavesInfo;
	}

	public void setMonthLeavesInfo(Set<MonthLeave> monthLeavesInfo) {
		this.monthLeavesInfo = monthLeavesInfo;
	}

}
