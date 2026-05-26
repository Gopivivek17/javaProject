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
	
	Student1(){
		System.out.println("Constructor overloading");
		
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
		
		// 1. Using Lambda Expression:
        // Manually passing arguments to the 'new' keyword
		
		Interf i = (name, rollNo, age, marks) -> new Student1(name, rollNo, age, marks);
		
		Student1 s1 = i.get("Gopi",32896,22,97);
		
		System.out.println(s1);
		
		// 2. Using Constructor Reference (ClassName::new):
        // The compiler maps Interf.get() directly to the Student1 constructor.
        // This is cleaner and more readable than the Lambda version above.
		
		// Here get method in the Interface Interf refers to the constructor in Student1 class this is called constructor reference
		
		
		Interf r = Student1::new; 
		
		// and also the get method only refers to the Student1 constructor of same arguments 
		Student1 s2 = r.get("Ram",25078,20,89);
		
		System.out.println(s2);
		

	}



}
