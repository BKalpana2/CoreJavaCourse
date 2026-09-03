package com.Oop;

public class EmployeeMain{
	
	public static void main(String[]args) {
//		Employee e1=new Employee(101,"suraj","Google",200000.09);
//		System.out.println(e1.id+" "+e1.name+" "+e1.company+" "+e1.salary);
//		CodegnanEmployee cm=new CodegnanEmployee();
//		cm.id=20;
//		cm.name="kalpana";
//		cm.location="hyderbad";
//		cm.salary=20000.88;
//		cm.location="Hyderbad";
//		CodegnanEmployee cm1=new CodegnanEmployee("chennai");
		
		CodegnanEmployee c1=new CodegnanEmployee();
		CodegnanEmployee c2=new CodegnanEmployee("Hyderabad");
		CodegnanEmployee c3=new CodegnanEmployee("Cse","kphb");
		CodegnanEmployee c4=new CodegnanEmployee("hyd","Cse","jntu");
		CodegnanEmployee c5=new CodegnanEmployee(101,"Kalpana","Google",200000.66,"Chennai","Ameerpet", "SD");
		c1.display();
		c2.display();
		c3.display();
		c4.display();
		c5.display();
	
	}
}