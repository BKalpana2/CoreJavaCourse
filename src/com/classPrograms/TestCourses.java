package com.classPrograms;
public class TestCourses {
	public static void main(String[] args) {
		Courses c1=new Courses();
		c1.courseId=9;
		c1.courseName="JFS";
		c1.duration=5;
		c1.coursefee=41000.88;
		c1.getCourse();
		Courses c2=new Courses();
		c2.courseId=6;
		c2.courseName="PFS";
		c2.duration=6;
		c2.coursefee=500000.44;
		c2.getCourse();
		Courses c3=new Courses();
		c3.courseId=4;
		c3.courseName="AI";
		c3.duration=8;
		c3.coursefee=800000.22;
		c3.getCourse();
		Courses c4=new Courses();
		c4.courseId=2;
		c4.courseName="Digital";
		c4.duration=3;
		c4.coursefee=250000.22;
		c4.getCourse();
		System.out.println("***********************************");
		Courses c=new Courses();
		c.demoMethod();
		
	}

}
