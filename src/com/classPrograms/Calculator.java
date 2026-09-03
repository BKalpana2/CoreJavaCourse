package com.classPrograms;

public class Calculator {
//	//method to add two integers
//	public int addInteger(int first,int second) {
//		return first+second;
//	}
//	//method to add three integers
//	public int addThreeInteger(int first,int second,int third) {
//		return first+second+third;
//	}
	//method signature is nothing but name of the method ,different types  of 		arguments passing to the  method
	//add(int a,int b)
	//duplicate method means having same method name and type of variables 
	public void add(int a,String b) {
		System.out.println(a+b);
	}
	public void add(String b,int a) {
		System.out.println(b+a);
	}
	public static void main(String[] args) {
//		Calculator c=new Calculator();
//		int result=c.addInteger(10, 20);
//		System.out.println("Sum of two numbers : "+result);
//		int result2=c.addThreeInteger(10, 20, 30);
//		System.out.println("Sum of three numbers : "+result2);
	}
}
