package com.collections;

import java.util.HashSet;

public class StudentDemo {
public static void main(String[] args) {
	Student s1=new Student(101,"kalyan");
	Student s2=new Student(102,"Thanuja");
	Student s3=new Student(101,"Kalyan");
	
	HashSet<Student> students=new HashSet<>();
	students.add(s1);
	students.add(s2);
	students.add(s3);
	System.out.println(students);
	
}
}
