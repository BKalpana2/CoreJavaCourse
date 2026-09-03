package com.Abstarction;

public abstract class PaymentSystem{
	//variable
	int paymentId;

	//constructor
	PaymentSystem(int paymentId){
		this.paymentId=paymentId;
	}
	
	//methods
	
	//1.pay()-abstarct method
	abstract void pay();
	
	abstract void refund();
	abstract void showStatues();
	
	//2.showDetails()-concrete method
	public void showDetails() {
		System.out.println("Payment done with Id : "+paymentId);
	}
}
