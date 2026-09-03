package com.ExceptionHandling;
@SuppressWarnings("serial")
class NotEligibleForCourseException extends Exception{
public NotEligibleForCourseException(String message) {
	super(message);
}
}
class Student{
	String name;
	float percentage;
	public Student(String name,float percentage) {
		this.name=name;
		this.percentage=percentage;
	}
	public void enrollCourse() throws NotEligibleForCourseException{
		if(percentage<60) {
		throw new NotEligibleForCourseException("Student Not eligible for the course");
		}
		System.out.println("course enrollement successfully");
	}
}	
public class CourseEnrollment {
	public static void main(String[] args) {
	Student s=new Student("Ravi",52);
	System.out.println("Student : "+s.name);
	System.out.println("Percentage : "+s.percentage);
	try {
		s.enrollCourse();
	}catch(NotEligibleForCourseException e){
		System.out.println("Not eligible for course enrollment");
	}
	}
}

