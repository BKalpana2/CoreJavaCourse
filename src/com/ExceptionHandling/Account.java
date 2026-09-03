package com.ExceptionHandling;

public class Account {
	static double balance;
	Account(double balance){
		Account.balance=balance;
	}
	public static void withdraw(double amount) {
		try {
		if(amount>balance) {
			throw new  CustomExceptionDemo("Insufficent funds");
		}
		System.out.println(amount+"Amount withdraw successfully");
	}catch(Exception e) {
		System.out.println("Exception occured");
		e.printStackTrace();
	}
	}

	public static void main(String[] args) throws CustomExceptionDemo  {
		Account a=new Account(10000);
		a.withdraw(11000);
	}
}
