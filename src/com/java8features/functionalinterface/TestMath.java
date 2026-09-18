package com.java8features.functionalinterface;
public class TestMath {
	public static void main(String[] args) {
		/*
		 * If we need a 4 digit number : 
		 * the four digit number starts with 1000
		 * and ends with at 9999
		 * so our range is 1000 to 9999
		 * Math.random() generates the random value between 0.0 to 1.0
		 * when you multiply this value with 9000
		 * the range becomes 0.0 to less than 9000.0
		 * after typecasting the int 
		 * we get the value before the decimal i.e 0
		 * so we add 1000 to value
		 * */
		System.out.println((int)(Math.random()*9000)+1000);
	}
}
