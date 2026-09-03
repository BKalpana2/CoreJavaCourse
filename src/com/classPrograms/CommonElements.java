package com.classPrograms;

public class CommonElements {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {3,4,5,6};
		System.out.print("Commom elements are : ");
		//Outer for loop To iterate each element of a[]array
		for(int i=0;i<a.length;i++) {
			//To iterate b[] array
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}

	}

}
