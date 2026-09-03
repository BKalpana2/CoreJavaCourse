package com.ArrayTasks;
import java.util.Scanner;
public class LargestElement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size=s.nextInt();
		System.out.println("Enter the elements in the array : ");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println("Largest element : "+largest);
		s.close();

	}

}
