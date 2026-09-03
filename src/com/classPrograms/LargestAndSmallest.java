package com.classPrograms;

public class LargestAndSmallest {

	public static void main(String[] args) {
		int arr[]= {100,30,20, 50,78,100};
		System.out.print("Array of Elements : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
			
		}
		System.out.println("Largest Element : "+largest);
		System.out.println("Smallest Element : "+smallest);

	}

}
