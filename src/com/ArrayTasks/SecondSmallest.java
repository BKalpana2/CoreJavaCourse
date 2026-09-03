package com.ArrayTasks;
import java.util.Scanner;
public class SecondSmallest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size=s.nextInt();
		System.out.println("Enter the elements in the array : ");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int ssmallest=Integer.MAX_VALUE;
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<size;i++) {
			if(arr[i]<smallest) {
				ssmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]<ssmallest&&arr[i]!=smallest) {
			ssmallest=arr[i];
			}
		}
		System.out.println("Second smallest : "+ssmallest);
		
		s.close();

	}

}
