package com.ExceptionHandling;

import java.util.Scanner;

public class StringCharacterFinder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str="JavaProgramming";
		try {
		System.out.println("Enter index : ");
		int index=s.nextInt();
		System.out.println("Index : "+index);
		System.out.println("Characterc : "+str.charAt(index));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Invalid character position.");
		}
		s.close();

	}

}
