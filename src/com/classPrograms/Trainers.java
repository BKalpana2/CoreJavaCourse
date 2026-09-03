package com.classPrograms;

public class Trainers {
	String name;
	int id;
	double salary;
	public String toString() {
		return "Name : "+name+" | "+"Id : "+id+" | "+ "Salary : "+salary;
	}
	Trainers(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
}
