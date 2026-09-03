package com.classPrograms;

public class ReverseArray {

	public static void main(String[] args) {
		//array declaration or initilisation
		int []arr= {1,2,3,4};
		int n=arr.length-1;
		System.out.print("Original Array : ");
		//To iterate the actual array 
		for(int i=0;i<=n;i++) {
			System.out.print(arr[i]+" ");
		}
		//To iterate the reverse array
		System.out.println();
		System.out.print("Reverse Array : ");
		for(int i=n;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
