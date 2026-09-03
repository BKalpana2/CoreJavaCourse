package com.String;

public class StringDemo {

	public static void main(String[] args) {
		String movie1="Spiderman";
		String movie2="Spiderman";
		String movie3="Avengers";

		System.out.println(movie1==movie3);
		System.out.println(movie1==movie2);

		System.out.println();

		String movie4=new String("Ice age");
		String movie5=new String("Ice age");
		String movie6=new String("Interdtellar");

		System.out.println(movie4==movie5);
		System.out.println();

		//	int age1=20;
		//	int age2=30;
		//	System.out.println(age1==age2);		
	}
}
