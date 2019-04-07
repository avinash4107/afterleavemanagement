package com.centraprise.hrmodule.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_salory_info")
public class SaloryInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int saloryInfoId;

	@Column(name = "basic_salory")
	private float basicSalory;

	@Column(name = "incentive")
	private float incentive;

	@Column(name = "special_allowance")
	private float specialAllowance;

	@Column(name = "special_payment")
	private float specialPayment;

	@Column(name = "income_tax")
	private float incomeTax;

	@Column(name = "provident_fund")
	private float providentFund;

	@Column(name = "gross_earings")
	private float grossEarings;

	@Column(name = "net_salory")
	private float netSalory;

	@Column(name = "total_deduction")
	private float totalDeduction;

	@Column(name = "professional_tax")
	private float professionalTax;

	@Column(name = "employee_number")

	private int employeeNumber;

	public int getSaloryInfoId() {
		return saloryInfoId;
	}

	public void setSaloryInfoId(int saloryInfoId) {
		this.saloryInfoId = saloryInfoId;
	}

	public float getBasicSalory() {
		return basicSalory;
	}

	public void setBasicSalory(float basicSalory) {
		this.basicSalory = basicSalory;
	}

	public float getIncentive() {
		return incentive;
	}

	public void setIncentive(float incentive) {
		this.incentive = incentive;
	}

	public float getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(float specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public float getSpecialPayment() {
		return specialPayment;
	}

	public void setSpecialPayment(float specialPayment) {
		this.specialPayment = specialPayment;
	}

	public float getIncomeTax() {
		return incomeTax;
	}

	public void setIncomeTax(float incomeTax) {
		this.incomeTax = incomeTax;
	}

	public float getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(float providentFund) {
		this.providentFund = providentFund;
	}

	public float getGrossEarings() {
		return grossEarings;
	}

	public void setGrossEarings(float grossEarings) {
		this.grossEarings = grossEarings;
	}

	public float getNetSalory() {
		return netSalory;
	}

	public void setNetSalory(float netSalory) {
		this.netSalory = netSalory;
	}

	public float getTotalDeduction() {
		return totalDeduction;
	}

	public void setTotalDeduction(float totalDeduction) {
		this.totalDeduction = totalDeduction;
	}

	public float getProfessionalTax() {
		return professionalTax;
	}

	public void setProfessionalTax(float professionalTax) {
		this.professionalTax = professionalTax;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public String toString() {
		return "SaloryInfo [saloryInfoId=" + saloryInfoId + ", basicSalory=" + basicSalory + ", incentive=" + incentive
				+ ", specialAllowance=" + specialAllowance + ", specialPayment=" + specialPayment + ", incomeTax="
				+ incomeTax + ", providentFund=" + providentFund + ", grossEarings=" + grossEarings + ", netSalory="
				+ netSalory + ", totalDeduction=" + totalDeduction + ", professionalTax=" + professionalTax
				+ ", employeeNumber=" + employeeNumber + "]";
	}

}
