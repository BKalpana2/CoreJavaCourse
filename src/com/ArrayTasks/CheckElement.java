package com.ArrayTasks;
import java.util.Scanner;
public class CheckElement {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size=s.nextInt();
		System.out.println("Enter the elements in the array : ");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Element to check : ");
		int key=s.nextInt();
		for(int i=0;i<size;i++) {
			if(arr[i]==key) {
				System.out.println("Element Found : "+arr[i]);
			break;
			}
		}
		s.close();

	}

}
