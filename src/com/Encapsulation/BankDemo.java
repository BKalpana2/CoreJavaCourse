package com.Encapsulation;

public class BankDemo {
public static void main(String[] args) {
	BankAccount account=new BankAccount(10000.00);
	
	//direct accessing balance not possible because the variable is declared private.
	//account.balance;

	//accessing balance using  a public gettert(accessor) method.
	double balance=account.getBalance();
	System.out.println(balance);

	account.setBalance(20000.00);
	System.out.println(account.getBalance());
	account.setBalance(-100000);
	System.out.println(account.getBalance());
}
}
