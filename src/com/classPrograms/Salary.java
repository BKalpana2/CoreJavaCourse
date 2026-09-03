package com.classPrograms;

public class Salary {
	double basic;
	double hra;
	double comission;
	public Salary(double basic, double hra, double comission) {
		super();
		this.basic = basic;
		this.hra = hra;
		this.comission = comission;
	}
	public double getGrossSalary(Salary s) {
		double grossSalary=s.basic+s.hra+s.comission;
		return grossSalary;
	}
	
}
