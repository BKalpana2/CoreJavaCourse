package com.classPrograms;
import java.util.Scanner;
public class Patterns {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the cnt : ");
		int n=s.nextInt();
		//1=>
//		for(int i=0;i<cnt;i++) {
//			for(int j=0;j<cnt;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		//2=>
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//3=>
//		for(int i=0;i<n;i++) {
//			for(int j=n;j>i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//4=>
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		//5=>
		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}	
		s.close();
	}
}
