package com.centraprise.hrmodule.model;

public class SaloryCommand {

	private float basic;
	private float incentive;
	private float allowance;
	private float specialpayment;
	private String employeenumber;

	public float getBasic() {
		return basic;
	}

	public void setBasic(float basic) {
		this.basic = basic;
	}

	public float getIncentive() {
		return incentive;
	}

	public void setIncentive(float incentive) {
		this.incentive = incentive;
	}

	public float getAllowance() {
		return allowance;
	}

	public void setAllowance(float allowance) {
		this.allowance = allowance;
	}

	public float getSpecialpayment() {
		return specialpayment;
	}

	public void setSpecialpayment(float specialpayment) {
		this.specialpayment = specialpayment;
	}

	public String getEmployeenumber() {
		return employeenumber;
	}

	public void setEmployeenumber(String employeenumber) {
		this.employeenumber = employeenumber;
	}

	@Override
	public String toString() {
		return "SaloryCommand [basic=" + basic + ", incentive=" + incentive + ", allowance=" + allowance
				+ ", specialpayment=" + specialpayment + ", employeenumber=" + employeenumber + "]";
	}

}
