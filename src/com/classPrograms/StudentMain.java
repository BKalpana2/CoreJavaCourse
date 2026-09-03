package com.classPrograms;

public class StudentMain {

	public static void main(String[] args) {
		//object creation
		Student s1=new Student();
		//populate elements
		s1.sid=614;
		s1.name="kalpana";
		s1.sage=20;
		
		//object creation
		Student s2=new Student();
		s2.sid=611;
		s2.name="Varalakshmi";
		s2.sage=21;
		
		//object creation
		Student s3=new Student();
		s3.sid=711;
		s3.name="Madhu";
		s3.sage=22;
		
		//object Array
		Student[] student=new Student[3];
		student[0]=s1;
		student[1]=s2;
		student[2]=s3;
		
		System.out.println("length : "+student.length);
		for(Student arr:student) {
			System.out.println("Student Details : "+arr.name);
			System.out.println("--------------------------");
			System.out.println(arr.sid);
			System.out.println(arr.name);
			System.out.println(arr.sage);
			System.out.println();
		}

	}

}
