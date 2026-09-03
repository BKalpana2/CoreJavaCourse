package com.Oop;

public class Developer extends Employee1{
		public Developer(String name) {
			super(name);
		}
@Override
public void work() {
	System.out.println(name+" is developing the application");
	}

public void writeCode() {
	System.out.println(name+" is writing the code");
}
}
