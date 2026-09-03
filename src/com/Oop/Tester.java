package com.Oop;

public class Tester extends Employee1 {
	
	public  Tester(String name) {
		super(name);
	}
	@Override
	public void work() {
		System.out.println(name+" is testing the application");
	}
	//Tester specific method
	public void testApplication() {
		System.out.println(name+" is testing the application for bugs");
	}

}
