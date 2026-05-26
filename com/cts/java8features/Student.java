package com.cts.java8features;

public class Student{
	
	 int studentId;
	 String name;
	 int marks;
	
	public Student(int studentId, String name, int marks) {
		
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return name+" : "+marks ;
	}


	
}
