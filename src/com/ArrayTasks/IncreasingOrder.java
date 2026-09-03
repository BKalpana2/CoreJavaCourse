package com.ArrayTasks;

import java.util.Scanner;

public class IncreasingOrder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size=s.nextInt();
		System.out.println("Enter the elements in the array : ");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Increasing order : ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		s.close();

	}

}
