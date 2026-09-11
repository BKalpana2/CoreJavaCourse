package com.collections.comparator;

import java.util.LinkedList;
import java.util.List;

public class Employee {
	int id;
	String name;
	public Employee(int id,String name) {
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public static void main(String[]args) {
	List<Employee> e=new LinkedList<>();
	e.add(new Employee(101,"kalpana"));
	e.add(new Employee(108,"kalyan"));
	e.add(new Employee(105,"padala"));
	System.out.println(e);
	
}
}
