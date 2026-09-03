package com.Abstarction;

public class TestMain {
	public static void main(String[] args) {
		CGPaymentSystem cg=new CGPaymentSystem(100,"kalpana",120000.00);
		//	System.out.println(cg.paymentId+" "+cg.username+" "+cg.amount);
		System.out.println(cg.tostring());
	}
}
