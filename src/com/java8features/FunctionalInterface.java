package com.java8features;
@java.lang.FunctionalInterface

public interface FunctionalInterface {

	public void method1();

	public static void method3() {
		System.out.println("Static");
	}
	default void myMethod() {
		System.out.println("Default method");
	}
}
