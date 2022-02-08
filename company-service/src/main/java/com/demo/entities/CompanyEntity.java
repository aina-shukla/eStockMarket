package com.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompanyEntity {

	@Id
	private String companyCode;
	private String companyName;
	private String companyCEO;
	private long companyTurnover;
	private String companyWebsite;

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyCEO() {
		return companyCEO;
	}

	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}

	public long getCompanyTurnover() {
		return companyTurnover;
	}

	public void setCompanyTurnover(long companyTurnover) {
		this.companyTurnover = companyTurnover;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	@Override
	public String toString() {
		return "CompanyEntity [companyCode=" + companyCode + ", companyName=" + companyName + ", companyCEO="
				+ companyCEO + ", companyTurnover=" + companyTurnover + ", companyWebsite=" + companyWebsite + "]";
	}

	public CompanyEntity(String companyCode, String companyName, String companyCEO, long companyTurnover,
			String companyWebsite) {
		super();
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.companyCEO = companyCEO;
		this.companyTurnover = companyTurnover;
		this.companyWebsite = companyWebsite;
	}

	public CompanyEntity() {
		super();
	}

}
