package com.ArrayTasks;
import java.util.Scanner;
public class SumAndAverage {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size=s.nextInt();
		System.out.println("Enter the elements in the array : ");
		int arr[]=new int[size];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum of elements : "+sum);
		float average=(float)sum/size;
		System.out.println("Average of elements : "+average);
		s.close();

	}

}
