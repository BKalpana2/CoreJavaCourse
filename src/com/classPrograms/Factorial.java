package com.classPrograms;

public class Factorial {
	
	public static int fact(int n) {
		
		//Base condition
		if(n==0||n==1) {
			return 1;
		}
		
		//Recursive call
		int s=n*fact(n-1);
		
		return s;
	}
	public static void main(String[] args) {
		
		int n=6;
		int result=fact(n);
		System.out.println("Factorial of 6 : "+result);	
	}

}
