package com.classPrograms;

public class JaggedArray {

	public static void main(String[] args) {
		/*
		 10 30  --> 2 elements in row 0
		 20 30 40 --> 3 elements in row 1
		 60 -->1 element in row 2
		 70 90 80 100 -->4 elements in row 3
		 */
		//creating and initializing a ragged array
		int [][] r= {{10,30},
		{20,30,40},
		{60},
		{70,90,80,100}		
		};
		for(int i=0;i<r.length;i++) {
			System.out.println("Row "+i);
			System.out.println("Number of colums : "+r[i].length);
			for(int j=0;j<r[i].length;j++) {
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}
	}

}
