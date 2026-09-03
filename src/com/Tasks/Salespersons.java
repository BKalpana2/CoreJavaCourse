package com.Tasks;
import java.util.*;
public class Salespersons {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num of persons : ");
		int n =sc.nextInt();
		System.out.print("Enter num of sales : ");
		int m = sc.nextInt();
		System.out.println("Enter the sales amount : ");
		int salesP[][]=new int[n][m];
		//To read input from keyboard
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				salesP[i][j]=sc.nextInt();
			}
		}
		int totalSum=0;
		//To iterate each row
		for(int i=0;i<n;i++)
		{
			int sum=0;
			System.out.println("Sales of Person : "+(i+1));
			//To iterate each column
			for(int j=0;j<m;j++)
			{
				System.out.print(salesP[i][j]+" ");
				//sum of each person
				sum+=salesP[i][j];
				//Grand sum all persons
				totalSum+=salesP[i][j];
			}
			System.out.println();
			System.out.println("Total Sales of each Person : "+(i+1)+" => "+sum);
			System.out.println();
		}
		System.out.println("Grand Total Sales : => "+totalSum);
		sc.close();                                 

	}

}
