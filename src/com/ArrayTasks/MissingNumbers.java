package com.ArrayTasks;

import java.util.Scanner;

public class MissingNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size=s.nextInt();
		System.out.println("Enter the elements in the array : ");
		int arr[]=new int[size];
		boolean[] p=new boolean[101];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			 if (arr[i] >= 1 && arr[i] <= 100) {
	                p[arr[i]] = true;
	            }
		}
		
		
		System.out.println("Missing Numbers are : ");
		for(int i=1;i<=100;i++) {
			if(!p[i]) {
				System.out.print(i+" ");
			}
		}
		
		s.close();

	}

}
