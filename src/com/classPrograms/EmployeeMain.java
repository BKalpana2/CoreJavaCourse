package com.classPrograms;

public class EmployeeMain {

	public static void main(String[] args) {
	//object creation
		Employee e1=new Employee();
		 e1.id=101;
		 e1.name="kalyan";
		 e1.gender='M';
		 e1.role="Software Developer";
		 e1.salary=100000;
		 e1.team=1;
	//object creation
		 Employee e2=new Employee();
		 e2.id=102;
		 e2.name="Thanuja";
		 e2.gender='F';
		 e2.role="frontend Developer";
		 e2.salary=90000;
		 e2.team=2;
	//object creation
		 Employee e3=new Employee();
		 e3.id=103;
		 e3.name="Demon";
		 e3.gender='M';
		 e3.role="Backend Developer";
		 e3.salary=80000;
		 e3.team=3;
	//object creation
		 Employee e4=new Employee();
		 e4.id=104;
		 e4.name="Rithu";
		 e4.gender='F';
		 e4.role="Backend Developer";
		 e4.salary=85000;
		 e4.team=4;
	//object creation
		 Employee e5=new Employee();
		 e5.id=105;
		 e5.name="Emmu";
		 e5.gender='M';
		 e5.role="Full stack Developer";
		 e5.salary=80000;
		 e5.team=5;	 
	//Array creation
		 Employee[] e=new Employee[5];
		 e[0]=e1;
		 e[1]=e2;
		 e[2]=e3;
		 e[3]=e4;
		 e[4]=e5;
	//length
		 System.out.println("Length : "+e.length);
	//enhanced for loop
		for(Employee arr:e) {
			System.out.println("Employee Details : "+arr.name);
			System.out.println("------------------------");
			System.out.println(arr.id);
			System.out.println(arr.name);
			System.out.println(arr.gender);
			System.out.println(arr.role);
			System.out.println(arr.salary);
			System.out.println(arr.team);
			System.out.println();
		}

	}

}
