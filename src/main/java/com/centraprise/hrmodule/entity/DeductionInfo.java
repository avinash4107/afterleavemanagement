package com.centraprise.hrmodule.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "deduction_info")
public class DeductionInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "deduction_info_id")
	private int deductionInfoId;
	@Column(name = "employee_number")
	private int employeenumber;

	@Column(name = "80C_payment_life_insurance_premium")
	private float lifeInsurance;

	@Column(name = "80C_unit_linked_insurance_scheme")
	private float Insurance;

	@Column(name = "80CCC_pension_plans")
	private float pension;

	@Column(name = "80C_public_provident_fund")
	private float ppf;

	@Column(name = "80C_national_saving_certificates")
	private float nsc;

	@Column(name = "80C_equity_linked_savings_scheme")
	private float elss;

	@Column(name = "80C_children_tutionfee")
	private float tutionfee;

	@Column(name = "80c_Fixed_deposit_taxsaver")
	private float taxsaver;

	@Column(name = "80C_housing_loan")
	private float housingloan;

	@Column(name = "80C_sukanaya_samriddhi_scheme")
	private float sss;

	@Column(name = "80ccd_national_pension_scheme")
	private float ccd;

	@Column(name = "80D_mediclaim_policy_premium_children")
	private float mediclaim;

	@Column(name = "80DP_mediclaim_policy_premium_parents")
	private float parents;

	@Column(name = "80DS_mediclaim_policy_premium_seniour_citizen")
	private float srcitizens;

	@Column(name = "80CCG_savings_scheme")
	private float investment;

	@Column(name = "80DDB_treatment_specified")
	private float treatment;

	@Column(name = "80DD_medical_treatment_handicaped")
	private float handicapped;

	@Column(name = "80U_physically_handicapped")
	private float physicallyhandi;

	@Column(name = "80E_payment_interest_loan_higher_education")
	private float higheredu;

	@Column(name = "80EE_addition_deduction_housing_loan")
	private float loan;

	public int getDeductionInfoId() {
		return deductionInfoId;
	}

	public void setDeductionInfoId(int deductionInfoId) {
		this.deductionInfoId = deductionInfoId;
	}

	public int getEmployeenumber() {
		return employeenumber;
	}

	public void setEmployeenumber(int employeenumber) {
		this.employeenumber = employeenumber;
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
		return "DeductionInfo [deductionInfoId=" + deductionInfoId + ", employeenumber=" + employeenumber
				+ ", lifeInsurance=" + lifeInsurance + ", Insurance=" + Insurance + ", pension=" + pension + ", ppf="
				+ ppf + ", nsc=" + nsc + ", elss=" + elss + ", tutionfee=" + tutionfee + ", taxsaver=" + taxsaver
				+ ", housingloan=" + housingloan + ", sss=" + sss + ", ccd=" + ccd + ", mediclaim=" + mediclaim
				+ ", parents=" + parents + ", srcitizens=" + srcitizens + ", investment=" + investment + ", treatment="
				+ treatment + ", handicapped=" + handicapped + ", physicallyhandi=" + physicallyhandi + ", higheredu="
				+ higheredu + ", loan=" + loan + "]";
	}

}
