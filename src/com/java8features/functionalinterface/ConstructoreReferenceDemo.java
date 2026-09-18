package com.java8features.functionalinterface;

import java.util.function.Supplier;

public class ConstructoreReferenceDemo {
	public static void main(String[] args) {
		Supplier<Student> supplier=()->new Student();
		supplier.get();
		//Short-cut way.
		Supplier<Student> supplier1=Student::new;
		supplier1.get();
	}
}