package com.classPrograms;
import java.util.Scanner;
public class MethodWays {
	public void add(int mark1,int mark2,String name) {
		System.out.println("Add method Started ");
		System.out.println("Total marks : "+(mark1+mark2));
		System.out.println("Add method completed ");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name=s.nextLine();
		System.out.println("Enter the mark1 : ");
		int mark1=s.nextInt();
		System.out.println("Enter the mark2 : ");
		int mark2=s.nextInt();
		MethodWays mw=new MethodWays();
		mw.add(mark1, mark2,name);
		System.out.println("In main mehtod");
		System.out.println("Mark1 : "+mark1);
		System.out.println("Mark2 : "+mark2);
		s.close();

	}

}
