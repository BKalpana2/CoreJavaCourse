package com.Tasks;

public class Employee {
int empid;
String empName;
int empAge;
double empSalary;

public String toString() {
	return "Emp_Id : "+empid+"\n"+"Emp_Name : "+empName+"\n"+"Emp_Age : "+empAge+"\n"+"Emp_Salary : "+empSalary;
}
Employee(int id,String name,int age,double salary){
	this.empid=id;
	this.empName=name;
	this.empAge=age;
	this.empSalary=salary;
}
}
