package com.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentMarksArray {

	public static void main(String[] args) {
		int []marks= {85,76,90,65,88};
		Scanner s=new Scanner(System.in);
		try {
		
			System.out.println("Enter the student number to dispaly : ");
			int n=s.nextInt();
					System.out.println("Student Number : "+n);
					System.out.println("Marks : "+marks[n-1]);
				
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("enter student number from 1-5");
		}catch(InputMismatchException e) {
			System.out.println("please enter valid input");
		}
s.close();
}
}
