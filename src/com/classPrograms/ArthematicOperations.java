package com.classPrograms;

import java.util.Scanner;

public class ArthematicOperations {
	public void add(int a,int b) {
		System.out.println("Sum of numbers :"+(a+b));
		System.out.println("Multiplication of two numbers : "+(a*b));
		System.out.println("Substaction of two numbers : "+(a-b));
		System.out.println("Division of two numbers : "+(a/b));
		System.out.println("Modulus Division of two numbers : "+(a%b));
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the a : ");
		int a=s.nextInt();
		System.out.print("Enter the b : ");
		int b=s.nextInt();
		ArthematicOperations ao=new ArthematicOperations();
		ao.add(a, b);
		s.close();
	}

}
