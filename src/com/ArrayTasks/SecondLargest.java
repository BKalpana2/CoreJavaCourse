package com.ArrayTasks;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size=s.nextInt();
		System.out.println("Enter the elements in the array : ");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		int highest=Integer.MIN_VALUE;
		int shighest=Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			if(arr[i]>highest) {
				shighest=highest;
			highest=arr[i];
		}else if(arr[i]>shighest && arr[i]!=highest) {
			shighest=arr[i];
		}
		}
		System.out.println("Second highest : "+shighest);
		s.close();
	}

}
