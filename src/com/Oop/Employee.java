package com.Oop;

public class Employee {
	int id;
	String name;
	String company;
	double salary;
	public Employee()
	{
		
	}
	public Employee(int id,String name,String company ,double salary) {
		this.id=id;
		this.name=name;
		this.company=company;
		this.salary=salary;
	}
	public void getEmployeeDetails() {
		System.out.println("Employee Details ....");
	}
	public void CalculateSalary() {
		System.out.println("Employee Salary ....");
	}
}
