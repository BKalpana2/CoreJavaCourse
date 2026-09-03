package com.classPrograms;
public class CourseMain {
	public void displayCourseList(Course[] k) {
		System.out.println("******************Course Details *********************");
		for(Course s:k) {
			System.out.println("CourseId : "+s.courseId);
			System.out.println("CourseName : "+s.courseName);
			System.out.println("CourseDuration : "+s.courseDuration);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Course c1=new Course(101,"Java",6);
		Course c2=new Course(102,"Python",8);
		Course c3=new Course(103,"DataScience",9);
		
		Course[] c={c1,c2,c3};
		CourseMain cm=new CourseMain();
		cm.displayCourseList(c);
	}
}
