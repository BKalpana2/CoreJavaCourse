package com.java8features.functionalinterface;

import java.util.function.Supplier;

public class OTPSupplier {
	public static void main(String[] args) {
		//Supplier 
		Supplier<Integer> otpSupplier=() -> {
			return (int)(Math.random()*9000)+1000;
		};
		System.out.println("Generated Otp : "+otpSupplier.get());
	}
}
