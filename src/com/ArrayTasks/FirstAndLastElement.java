package com.ArrayTasks;
import java.util.Scanner;
public class FirstAndLastElement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size=s.nextInt();
		System.out.println("Enter the elements in the array : ");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("First Element : "+arr[0]);
		System.out.println("Last Element : "+arr[arr.length-1]);
		
		s.close();

	}

}
