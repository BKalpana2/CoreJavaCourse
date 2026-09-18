package com.java8features.functionalinterface;

public class Student {
	int id;
	String name;
	int marks;
	public Student(int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public boolean checkmarks(Student student) {
		return student.marks>=60;
	} 
	public Student() {
		System.out.println("Student object is created");
	}
}
