package com.classPrograms;

public class Students {
	int studentId;
	String studentName;
	int mark1;
	int mark2;
	int mark3;
	public Students(int studentId, String studentName, int mark1, int mark2, int mark3) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	public void displayStudentDetails(Students s) {
		System.out.println("Student ID : "+s.studentId);
		System.out.println("Student Name : "+s.studentName);
	double percentage=calculatePercentage(s.mark1,s.mark2,s.mark3);	
	System.out.println("Student percentage : "+percentage);
	}
	public double calculatePercentage(int mark1,int mark2,int mark3) {
		double percentage=((mark1+mark2+mark3)/300.0)*100;
		return percentage;
	}
}
