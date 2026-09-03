package com.Tasks;
import java.util.Scanner;
public class MainEmployee {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of Employees : ");
		int n=s.nextInt();
		Employee[] e1=new Employee[n];
		for(int i=0;i<e1.length;i++) {
			System.out.println("Enter the emp id : ");
			int id=s.nextInt();
			System.out.println("Enter the emp name : ");
			String name=s.next();
			System.out.println("Enter the emp Age : ");
			int age=s.nextInt();
			System.out.println("Enter the emp Salary : ");
			double salary=s.nextDouble();
			e1[i]=new Employee(id,name,age,salary);
		}
		System.out.println();
		System.out.println("Details of Employees");
		for(Employee e:e1) {
			System.out.println("---------------");
			System.out.println("Details of Employee "+e.empName);
			System.out.println(e);
		}
		s.close();
	}

}
