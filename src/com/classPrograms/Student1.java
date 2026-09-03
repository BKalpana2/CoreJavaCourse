package com.classPrograms;

public class Student1 {
	public void register(String name) {
		System.out.println("Full Name : "+name);
		
	}
	public void register(String name,int age,char gender) {
		System.out.println("Name : "+name+" Age : "+age+" Gender : "+gender);	
	}
	public int register(int a) {
		return a;
	}

	public static void main(String[] args) {
		Student1 s=new Student1();
		s.register("Kalpana bathula");
		s.register("kalpana", 20, 'F');
	}

}
