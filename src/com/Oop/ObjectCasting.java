package com.Oop;

public class ObjectCasting {
		
	public static void performWork(Employee1 emp) {
		emp.work();
	}
	
	public static void main(String[] args) {
		Developer developer=new Developer("Ravi");
		developer.work();//child class work() invoked
		developer.writeCode();
		
		System.out.println();
		
		//Upcasting
		Employee1 emp1=new Developer("Raju");
		emp1.work(); //child class work () is invoked
		
		
		System.out.println();
		
		Employee1 em2=new Tester("priya");
		em2.work();
		
		System.out.println();
		
		Employee1 em3=new Manager("Mahesh");
		em3.work();
		System.out.println();
		
		performWork (new Developer("kalyan"));
		
		performWork(new Tester("Rithu"));
		
		performWork(new Manager("Thanuja"));
		
		System.out.println();
		//DownCasting
		Employee1 emp4=new Tester("Achayyamma");
		Tester t=(Tester)emp4;
		t.testApplication();
		
		System.out.println( );
		
		Employee1 emp5=new Employee1("Devara");
		//instanceof -check true or false 
		//instanceof is a operator
		if(emp5 instanceof Manager) {
		Manager m=(Manager)emp5;
		m.conductMeeting();
		}
		
	}

}
