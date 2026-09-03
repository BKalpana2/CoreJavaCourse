package com.Oop;
public class Course extends ParentCourse{
	int id;
	String courseName;

	public Course() {
		//constructor chaining  
		//calling one constructor from another constructor 
		this(24,"k",20);
	}
	public Course(int id,String courseName) {
		if(courseName==null) {
			this.courseName="Unknown";
		}else {
			this.id=id;
			this.courseName=courseName;
		}
	}

	//toString method is nothing but string represention of object
	@Override
	public String toString() {
		return id+" "+courseName+" "+parentCourseId;
	}

	public Course(int id,String courseName,int parentCourseId) {
		super(parentCourseId);
		this.id=id;
		this.courseName=(courseName==null)?"unknown":courseName;
		
	}
}
