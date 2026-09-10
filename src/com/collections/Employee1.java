package com.collections;
import java.util.HashSet;
import java.util.Objects;
	public class Employee1 {
		private int id;
		private String name;
		private String departement;
	    public Employee1(int id,String name,String department) {
		this.id=id;
		this.name=name;
		this.departement=department;
	   }
		@Override
		public String toString() {
			return "Employee1 [id=" + id + ", name=" + name + ", departement=" + departement + "]";
		}
	   //HashSet first calls  hashCode() to decide 
		//which bucket should be checked.
		//here we consider id for identifuing an employee.
		//so,employees having same id will produce same hash code.
	   @Override
	   public int hashCode() {
	   return Objects.hash(id);
	   }
	   @Override
    	public boolean equals(Object obj) {
		//step1 : are both references pointing to same object
		if(this==obj) {
			return true;
		}
		//step2 : if the other reference is null
		if(obj==null) {
			return false;	
		}
		//step3 : compare the fields which defines the equality
		if (!(obj instanceof Employee)) {
            return false;
        }
		Employee1 other=(Employee1)obj;
		return this.id==other.id;
	}
	
	public static void main(String[] args) {
		HashSet<Employee1> emp=new HashSet<>();
		Employee1 e1=new Employee1(101,"varalakshmi","developing");
		Employee1 e2=new Employee1(102,"Kalpana","HR department");
		Employee1 e3=new Employee1(103,"siva","developing");
		
		//adding the emp with same id as e1
		Employee1 e4=new Employee1(101,"varalakshmi uyyuru","supporting");
		System.out.println(emp.add(e1));
	    System.out.println(emp.add(e2));
	    System.out.println(emp.add(e3));
	    System.out.println(emp.add(e4));
	    
	   System.out.println("\n Empoyees in Hashset");
	   for(Employee1 emps:emp){
		System.out.println(emps);
	   }
	   }
	}

