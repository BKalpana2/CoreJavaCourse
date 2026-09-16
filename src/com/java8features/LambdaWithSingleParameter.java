package com.java8features;

public class LambdaWithSingleParameter {
	public static void main(String[] args) {
		Greeting greet =(name)->System.out.println("Hello ❤️ "+name);
		greet.greet("Kalyan");
		greet.greet("thanuja");
	}
}
