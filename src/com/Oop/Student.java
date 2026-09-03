package com.Oop;

public class Student {
	int studentId;
	String student;
	Trainer trainer;
	String course;
	Trainer trainers;
	public Student(int trainerId, String trainer,Trainer trainers) {
		super();
		this.studentId = trainerId;
		this.student = trainer;  
		this.trainer=trainers;
	}

	public void studentDetails() {
		System.out.println("StudentId : "+studentId);
		System.out.println("Student : "+student);
	}

}
