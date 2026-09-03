package com.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		try {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the operand 1 : ");
		int operand1=s.nextInt();
		System.out.println("Enter the operator : ");
		char operator=s.next().charAt(0);
		System.out.println("Enter the operand 2 : ");
		int operand2=s.nextInt();
		
		switch(operator) {
		case '+':
			System.out.println(operand1+operand2);
			break;
		case '-':
			System.out.println(operand1-operand2);
			break;
		case '*':
			System.out.println(operand1*operand2);
			break;

		case '/':
			System.out.println(operand1/operand2);
			break;
		case '%':
			System.out.println(operand1%operand2);
			break;
		}
		s.close();
		}
		catch(ArithmeticException e) {
			System.out.println("Donnot divide by zero..");
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input ! please enter the valid input");
		}
		
	

	}

}
