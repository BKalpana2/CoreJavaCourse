package com.Encapsulation;

public class BankAccount {
private double balance;

BankAccount(double balance){
	this.balance=balance;
}
//getter
public double getBalance() {	
	return balance;
}
//setter
public void setBalance(double balance) {
	//validation
	if(balance>=0)
	this.balance=balance;
	else
		System.out.println("negative balance cannot be set");
}
}
