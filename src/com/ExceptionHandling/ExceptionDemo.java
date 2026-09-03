package com.ExceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
	int totalmarks=500;
	int totalsubjects=0;
	int marks[]=new int[2];
	try {
	 int averagemarks=totalmarks/totalsubjects;
		marks[0]=2;
		marks[1]=3;
		marks[2]=5;
	}
	catch(ArrayIndexOutOfBoundsException a ) {
		System.out.println("index Out ");
	}
	catch(ArithmeticException e) {
		e.printStackTrace();
		System.out.println("divide by zero");
	}
	System.out.println("Average marks ");
	}

}
