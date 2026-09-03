package com.Tasks;
import java.util.Scanner;
public class FruitsMain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Fruits f1=new Fruits();
		System.out.println("Enter the fruit 1 : ");
		 f1.name=s.next();
		System.out.println("Enter the color : ");
		f1.color=s.next();
		System.out.println("Enter the cost : ");
		f1.cost=s.nextInt();
		System.out.println("------------------");
		Fruits f2=new Fruits();
		System.out.println("Enter the fruit 2 : ");
		f2.name=s.next();
		System.out.println("Enter the color : ");
		f2.color=s.next();
		System.out.println("Enter the cost : ");
		f2.cost=s.nextInt();
		System.out.println("-------------------");
		Fruits f3=new Fruits();
		System.out.println("Enter the fruit 3 : ");
		 f3.name=s.next();
		System.out.println("Enter the color : ");
		f3.color=s.next();
		System.out.println("Enter the cost : ");
		f3.cost=s.nextInt();
		System.out.println("-------------------");
		Fruits f4=new Fruits();
		System.out.println("Enter the fruit 4 : ");
		 f4.name=s.next();
		System.out.println("Enter the color : ");
		f4.color=s.next();
		System.out.println("Enter the cost : ");
		f4.cost=s.nextInt();
		System.out.println("-----------------");
		Fruits f5=new Fruits();
		System.out.println("Enter the fruit 5 : ");
		 f5.name=s.next();
		System.out.println("Enter the color : ");
		f5.color=s.next();
		System.out.println("Enter the cost : ");
		f5.cost=s.nextInt();
		Fruits[] f=new Fruits[5];
		f[0]=f1;
		f[1]=f2;
		f[2]=f3;
		f[3]=f4;
		f[4]=f5;
		System.out.println("Length of the array : "+f.length);
		for(Fruits arr:f) {
			System.out.println("-------------------");
			System.out.println("Details of "+arr.name);
			System.out.println("Fruit name : "+arr.name);
			System.out.println("Fruit color : "+arr.color);
			System.out.println("Fruit cost : "+arr.cost);
			
		}
		
		s.close();

	}

}
