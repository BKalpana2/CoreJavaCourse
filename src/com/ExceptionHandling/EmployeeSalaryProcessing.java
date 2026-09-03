package com.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeSalaryProcessing {

	public static void main(String[] args) {
		double[] salaries={25000,30000,45000,55000,70000};
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the employee index : ");
			int index=s.nextInt();
			System.out.println("Salary : "+salaries[index]);
			System.out.println("Annual salary : "+salaries[index]*12);
			System.out.println("Bonus : "+(salaries[index]*10)/100);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid employee index.");
		}catch(InputMismatchException e) {
			   System.out.println("Please enter a valid numeric index.");
		}
		s.close();
	}
}
