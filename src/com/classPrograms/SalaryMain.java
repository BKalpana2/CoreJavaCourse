package com.classPrograms;
public class SalaryMain {
	public static void main(String[] args) {
	Salary s=new Salary(500,500,1000);
	double res=s.getGrossSalary(s);
	System.out.println("Gross Salary : "+res);

	}

}
