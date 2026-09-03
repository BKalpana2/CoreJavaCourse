package com.ExceptionHandling;

public class BasicExceptionChallenge {

	public static void main(String[] args) {
		int a[]= {2,4,6};
		System.out.println("Application started");
		try {
			int x=2/1;
			System.out.println(a[9]);
		}
		catch(ArithmeticException ae) {
			System.out.println("ari occured");
		}
		catch(ArrayIndexOutOfBoundsException o) {
			System.out.println("out occured");
		}
		System.out.println("Application continues");

	}

}
