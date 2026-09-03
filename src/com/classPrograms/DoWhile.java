package com.classPrograms;
import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=s.nextInt();
		int num=1;
		do {
			System.out.println(n+" * "+num+" = "+(n*num));
			num++;
		}while(num<=10);
		s.close();
	}
}
