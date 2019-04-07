package com.centraprise.hrmodule.model;

public class FinalSalaryInfoDTO {

	private int id;
	private int employeeNumber;
	private int year;
	private float creditedLeavs;
	private float availed;
	private float balance;
	private float lossOfPay;

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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getCreditedLeavs() {
		return creditedLeavs;
	}

	public void setCreditedLeavs(float creditedLeavs) {
		this.creditedLeavs = creditedLeavs;
	}

	public float getAvailed() {
		return availed;
	}

	public void setAvailed(float availed) {
		this.availed = availed;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getLossOfPay() {
		return lossOfPay;
	}

	public void setLossOfPay(float lossOfPay) {
		this.lossOfPay = lossOfPay;
	}

	@Override
	public String toString() {
		return "FinalSalaryInfoDTO [id=" + id + ", employeeNumber=" + employeeNumber + ", year=" + year
				+ ", creditedLeavs=" + creditedLeavs + ", availed=" + availed + ", balance=" + balance + ", lossOfPay="
				+ lossOfPay + "]";
	}

}
