package com.Oop;

public class CodegnanEmployee extends Employee{
	String location;
	String branch;
	String department;
// constructor with no parameters
	public CodegnanEmployee() {}

//constructor with single parameter
	public CodegnanEmployee(String location) {
		this.location=location;
		
	}
	
//constructor with two parameters
public CodegnanEmployee(String department,String branch) {
	this.department=department;
	this.branch=branch;
}

//Constructor with three parameters
public CodegnanEmployee(String location,String department,String branch) {
	this.location=location;
	this.department=department;
	this.branch=branch;
}

//constructor with all parameters
public CodegnanEmployee(int id,String name,String company,double salary,String branch,String location,String department ) {
	this.id=id;
	this.name=name;
	this.branch=branch;
	this.company=company;
	this.department=department;
	this.location=location;
	this.salary=salary;
}
public void display () {
	System.out.println(id+" | "+"name"+" | "+branch+"  | "+company+" | "+department+" | "+location+" | "+salary+" | ");
}
}
