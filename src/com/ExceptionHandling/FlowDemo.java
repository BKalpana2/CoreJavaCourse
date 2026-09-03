package com.ExceptionHandling;

public class FlowDemo {

	public static void main(String[] args) {
		try {
			System.out.println("S1");
			int x=10/2;
			System.out.println("s2");
		}
		catch(ArithmeticException ae) {
			System.out.println("s3");
		}
		System.out.println("s4");

	}

}
