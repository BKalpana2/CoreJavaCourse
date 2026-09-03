package com.ExceptionHandling;

@SuppressWarnings("serial")
class NotEligibleForVote extends Exception{
	public NotEligibleForVote(String message) {
		super(message);
	}
}

class Voter{
	String name;
	int age;
	public Voter(String name,int age) {
		this.name=name;
		this.age=age;
	}
		public void eligible() throws NotEligibleForVote {
			if(age <18) {
				throw new NotEligibleForVote("Voter not Eligible to vote");
			}
			System.out.println("voter is Eligible to do vote");
		}
}
public class CustomException {
	
	public static void main(String[] args) {
		Voter v=new Voter("Kalpana",2);
		System.out.println("Voter Name : "+v.name);
		System.out.println("Voter age :  "+v.age);
		try {
			v.eligible();
		}catch(NotEligibleForVote n ) {
			System.out.println("Voter not eligible to vote");
		}
	}

}
