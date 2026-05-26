package com.cts.java8features;

class Student1{
	String name;
	int rollNo;
	int age;
	int marks;
	
	Student1(String name, int rollNo, int age, int marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", rollNo=" + rollNo + ", age=" + age + ", marks=" + marks + "]";
	}
	
	
	
}

interface Interf{
	
	public Student1 get(String name, int rollNo, int age, int marks);
}

public class ConstructorReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interf i = (name, rollNo, age, marks) -> new Student1(name, rollNo, age, marks);
		
		Student1 s1 = i.get("Gopi",32896,22,97);
		
		System.out.println(s1);
		
		Interf r = Student1::new;
		
		Student1 s2 = r.get("Ram",2507388,20,100);
		
		System.out.println(s2);
		

	}



}
