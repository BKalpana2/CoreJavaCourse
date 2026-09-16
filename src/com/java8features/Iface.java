package com.java8features;

public interface Iface {
	public void abstractMethod();
	default void defaultMethod() {
		System.out.println("Default method called ....");
	}
	 static void staticMethod() {
		System.out.println("Static method....");
	}
}
