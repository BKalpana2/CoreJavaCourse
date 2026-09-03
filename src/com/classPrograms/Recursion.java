package com.classPrograms;

public class Recursion {
	
	public static void printNumbers1toN(int n) {
		if(n==0) {
			return;
		}
		printNumbers1toN(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		int n=10;
		printNumbers1toN(n);

	}

}
