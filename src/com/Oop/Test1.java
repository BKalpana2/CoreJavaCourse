package com.Oop;

public class Test1 {

	public static void main(String[] args) {
		
		CreditPay cp=new CreditPay();
		cp.pay();//Overriden method called
		cp.generateReceipt();//parent method called
		
		System.out.println();
		
		CashPayment cap=new CashPayment();
		cap.pay();//Parent method called
		cap.generateReceipt();//parent  method called
		cap.cashStored();//child class method
		
		
		
	}

}
