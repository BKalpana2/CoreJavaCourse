package com.Oop;

public class Manager extends Employee1 {
 public Manager(String name) {
	 super(name);
 }
 @Override
 public void work() {
	 System.out.println(name+" is managing the team");
 }
 
 //manager specific method
 public void  conductMeeting() {
	 System.out.println(name+" is conducting team meeting");
 }
}
