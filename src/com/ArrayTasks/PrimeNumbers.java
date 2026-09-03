package com.ArrayTasks;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size=s.nextInt();
		System.out.println("Enter the elements in the array : ");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			int num=arr[i];
			boolean isprime=true;
			if(num<=1) {
				isprime=false;
			}else {
				for(int j=2;j<=num/2;j++) {
					if(num%j==0) {
						isprime=false;
						break;
					}
				}
			}
			if(isprime) {
				System.out.print(num+" ");
			}
		}
		
		s.close();

	}

}
