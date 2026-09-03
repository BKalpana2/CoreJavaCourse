package com.classPrograms;

public class Company {
	int companyId;
	String companyName;
	int empCount;
	String companyLocation;
	double companyTurnOver;
	public Company(int companyId, String companyName, int empCount, String companyLocation,double companyTurnOver) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.empCount = empCount;
		this.companyLocation = companyLocation;
		this.companyTurnOver=companyTurnOver;
	}
	public int getCompanyId() {
		return companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public int getempCount() {
		return empCount;
	}
	public String getcompanyLocation() {
		return companyLocation;
	}
	public double getcompanyTurnOver() {
		return companyTurnOver;
	}
	
}
