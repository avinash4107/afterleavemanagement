package com.centraprise.hrmodule.model;

public class DeductionCommand {
	private String employeeNumber;
	private float lifeInsurance;
	private float Insurance;
	private float pension;
	private float ppf;
	private float nsc;
	private float elss;
	private float tutionfee;
	private float taxsaver;
	private float housingloan;
	private float sss;
	private float ccd;
	private float mediclaim;
	private float parents;
	private float srcitizens;
	private float investment;
	private float treatment;
	private float handicapped;
	private float physicallyhandi;
	private float higheredu;
	private float loan;

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public float getLifeInsurance() {
		return lifeInsurance;
	}

	public void setLifeInsurance(float lifeInsurance) {
		this.lifeInsurance = lifeInsurance;
	}

	public float getInsurance() {
		return Insurance;
	}

	public void setInsurance(float insurance) {
		Insurance = insurance;
	}

	public float getPension() {
		return pension;
	}

	public void setPension(float pension) {
		this.pension = pension;
	}

	public float getPpf() {
		return ppf;
	}

	public void setPpf(float ppf) {
		this.ppf = ppf;
	}

	public float getNsc() {
		return nsc;
	}

	public void setNsc(float nsc) {
		this.nsc = nsc;
	}

	public float getElss() {
		return elss;
	}

	public void setElss(float elss) {
		this.elss = elss;
	}

	public float getTutionfee() {
		return tutionfee;
	}

	public void setTutionfee(float tutionfee) {
		this.tutionfee = tutionfee;
	}

	public float getTaxsaver() {
		return taxsaver;
	}

	public void setTaxsaver(float taxsaver) {
		this.taxsaver = taxsaver;
	}

	public float getHousingloan() {
		return housingloan;
	}

	public void setHousingloan(float housingloan) {
		this.housingloan = housingloan;
	}

	public float getSss() {
		return sss;
	}

	public void setSss(float sss) {
		this.sss = sss;
	}

	public float getCcd() {
		return ccd;
	}

	public void setCcd(float ccd) {
		this.ccd = ccd;
	}

	public float getMediclaim() {
		return mediclaim;
	}

	public void setMediclaim(float mediclaim) {
		this.mediclaim = mediclaim;
	}

	public float getParents() {
		return parents;
	}

	public void setParents(float parents) {
		this.parents = parents;
	}

	public float getSrcitizens() {
		return srcitizens;
	}

	public void setSrcitizens(float srcitizens) {
		this.srcitizens = srcitizens;
	}

	public float getInvestment() {
		return investment;
	}

	public void setInvestment(float investment) {
		this.investment = investment;
	}

	public float getTreatment() {
		return treatment;
	}

	public void setTreatment(float treatment) {
		this.treatment = treatment;
	}

	public float getHandicapped() {
		return handicapped;
	}

	public void setHandicapped(float handicapped) {
		this.handicapped = handicapped;
	}

	public float getPhysicallyhandi() {
		return physicallyhandi;
	}

	public void setPhysicallyhandi(float physicallyhandi) {
		this.physicallyhandi = physicallyhandi;
	}

	public float getHigheredu() {
		return higheredu;
	}

	public void setHigheredu(float higheredu) {
		this.higheredu = higheredu;
	}

	public float getLoan() {
		return loan;
	}

	public void setLoan(float loan) {
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "DeductionCommand [employeeNumber=" + employeeNumber + ", lifeInsurance=" + lifeInsurance
				+ ", Insurance=" + Insurance + ", pension=" + pension + ", ppf=" + ppf + ", nsc=" + nsc + ", elss="
				+ elss + ", tutionfee=" + tutionfee + ", taxsaver=" + taxsaver + ", housingloan=" + housingloan
				+ ", sss=" + sss + ", ccd=" + ccd + ", mediclaim=" + mediclaim + ", parents=" + parents
				+ ", srcitizens=" + srcitizens + ", investment=" + investment + ", treatment=" + treatment
				+ ", handicapped=" + handicapped + ", physicallyhandi=" + physicallyhandi + ", higheredu=" + higheredu
				+ ", loan=" + loan + "]";
	}

}
