package com.centraprise.hrmodule.model;

public class SaloryInfoListDTO {

	private int id;
	private int employeeNumber;
	private float basicSalaory;
	private float incentive;
	private float specialAllowance;
	private float specialPayment;
	private float grossEarings;
	private float providentFund;
	private float incomeTax;
	private float professionalTax;
	private float totalDeductions;
	private float netSalory;

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

	public float getBasicSalaory() {
		return basicSalaory;
	}

	public void setBasicSalaory(float basicSalaory) {
		this.basicSalaory = basicSalaory;
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

	public float getGrossEarings() {
		return grossEarings;
	}

	public void setGrossEarings(float grossEarings) {
		this.grossEarings = grossEarings;
	}

	public float getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(float providentFund) {
		this.providentFund = providentFund;
	}

	public float getIncomeTax() {
		return incomeTax;
	}

	public void setIncomeTax(float incomeTax) {
		this.incomeTax = incomeTax;
	}

	public float getProfessionalTax() {
		return professionalTax;
	}

	public void setProfessionalTax(float professionalTax) {
		this.professionalTax = professionalTax;
	}

	public float getTotalDeductions() {
		return totalDeductions;
	}

	public void setTotalDeductions(float totalDeductions) {
		this.totalDeductions = totalDeductions;
	}

	public float getNetSalory() {
		return netSalory;
	}

	public void setNetSalory(float netSalory) {
		this.netSalory = netSalory;
	}

	@Override
	public String toString() {
		return "SaloryInfoListDTO [id=" + id + ", employeeNumber=" + employeeNumber + ", basicSalaory=" + basicSalaory
				+ ", incentive=" + incentive + ", specialAllowance=" + specialAllowance + ", specialPayment="
				+ specialPayment + ", grossEarings=" + grossEarings + ", providentFund=" + providentFund
				+ ", incomeTax=" + incomeTax + ", professionalTax=" + professionalTax + ", totalDeductions="
				+ totalDeductions + ", netSalory=" + netSalory + "]";
	}

}
