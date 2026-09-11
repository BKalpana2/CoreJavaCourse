package com.collections.comparator;

import java.util.HashSet;


public class Student {
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Student s1=new Student(110,"kalyan");
		Student s2=new Student(190,"thanuja");
		Student s3=new Student(150,"rithu");
		Student s4=new Student(100,"demon");
		Student s5=new Student(11,"kp");
		
		HashSet<Student>students=new HashSet<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		for(Student s:students) {
		System.out.println(s);
		}	
	}
}
