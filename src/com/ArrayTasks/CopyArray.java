package com.ArrayTasks;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size=s.nextInt();
		System.out.println("Enter the elements in the array : ");
		int arr1[]=new int[size];
		int arr2[]=new int[size];
		for(int i=0;i<size;i++) {
			arr1[i]=s.nextInt();
		}		
		for(int i=0;i<size;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("Copied elements");
		for(int i=0;i<size;i++) {
			System.out.print(arr2[i]+" ");
		}
		s.close();

	}

}
