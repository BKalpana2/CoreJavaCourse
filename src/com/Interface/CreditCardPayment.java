package com.Interface;

public abstract class CreditCardPayment implements Payment {

	@Override
	public void refund() {
		System.out.println("Credit cards payment refunded");
		
	}

	
}
