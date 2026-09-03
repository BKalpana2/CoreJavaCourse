package com.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentResultCalculator {
	float totalmarks;
	float average;
	float percentage;
	
	public void totalmarks(int s1,int s2,int s3,int s4,int s5) {
		totalmarks=s1+s2+s3+s4+s5;
		System.out.println("Total marks : "+totalmarks);
	}
	public void average() {
	average=totalmarks/5;
	System.out.println("Average : "+average);
	}
	public void percentage() {
		percentage=(totalmarks/500)*100;
		System.out.println("Percentage : "+percentage+"%");
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the marks for 5 subjects : ");
		
		System.out.println("Enter the marks for  sub 1: ");
		int s1=s.nextInt();
		System.out.println("Enter the marks for sub 2: ");
		int s2=s.nextInt();
		System.out.println("Enter the marks for sub 3: ");
		int s3=s.nextInt();
		System.out.println("Enter the marks for sub 4: ");
		int s4=s.nextInt();
		System.out.println("Enter the marks for sub 5: ");
		int s5=s.nextInt();
		StudentResultCalculator sr=new StudentResultCalculator();
		
		sr.totalmarks(s1, s2, s3, s4, s5);
		sr.average();
		sr.percentage();
		}catch(InputMismatchException e) {
			System.out.println("Invalid input please enter numeric values only!");
		}
		
		s.close();

	}

}
