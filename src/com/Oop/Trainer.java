package com.Oop;

public class Trainer {
	int trainerId;
	String trainer;
public Trainer(int trainerId, String trainer,String technology) {
		super();
		this.trainerId = trainerId;
		this.trainer = trainer;
	}
public void teach(Student s) {
	System.out.println(trainer+" is teaching "+s.student);
}
public void conductTraining() {
	System.out.println("Student Id : "+trainerId);
}
}
