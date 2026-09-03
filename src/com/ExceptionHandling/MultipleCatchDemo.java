package com.ExceptionHandling;

public class MultipleCatchDemo {

	public static void main(String[] args) {
	 int []numbers= {10,20,30};
	 try {
		 int result=10/2;
//		 System.out.println(numbers[5]);
	 }
//	 catch(ArithmeticException ae) {
//		 System.out.println("ae problem");
//	 }
	 catch(ArrayIndexOutOfBoundsException a) {
		 System.out.println("out");
	 }
	 System.out.println("program done");
	}

}
