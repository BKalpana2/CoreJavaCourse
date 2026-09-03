package com.AccessModifier;

public class Parent {
	
	int age;//multiple copies
	static int count;//one copy
	
	//Non static mehtod or Instance method	
	public void method1() {
		System.out.println("Parent - method 1");
	}
	//Static method
	public static void method2() {
		System.out.println("Parent - static method2");
	}
}
