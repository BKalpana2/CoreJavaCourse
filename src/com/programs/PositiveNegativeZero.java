package com.programs;



import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		if(n>0) {
			System.out.println("Positive");
		}
		else if(n<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
		s.close();

	}

}

