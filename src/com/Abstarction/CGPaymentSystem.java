package com.Abstarction;

public class CGPaymentSystem extends PaymentSystem{
	String username;
	double amount;
	
	CGPaymentSystem(int id,String username,double amount){
		super(id);
		this.username=username;
		this.amount=amount;
		this.paymentId=id;
	}
	@Override
	void pay() {
		System.out.println("Paying using CGpaymentSystem");
	}

	@Override
	void refund() {
	System.out.println("Refund initiated");
		
	}

	@Override
	void showStatues() {
		System.out.println("Payment processed ");
		
	}

	public String tostring() {
		return paymentId+" "+username+" "+amount;
	}

}
