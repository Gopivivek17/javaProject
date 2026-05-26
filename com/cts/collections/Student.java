package com.cts.collections;

public class Student implements Comparable<Student> {
	
	private int studentId;
	private String name;
	private int marks;
	
	public Student(int studentId, String name, int marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "\nstudentId=" + studentId + ", name=" + name + ", marks=" + marks;
	}


	@Override
	public int compareTo(Student o) {
		
		return this.getMarks() - o.getMarks();
	}
	
	
}
