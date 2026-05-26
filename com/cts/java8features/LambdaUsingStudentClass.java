package com.cts.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaUsingStudentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> sl = Arrays.asList(
			
			new Student(32896,"Gopi Vivek",98),
			new Student(32815,"Ram",99),
			new Student(32816,"Rajeswari",78),
			new Student(32817,"Nirmala",89),
			new Student(32818,"Venkaiah",100)
				
		);
		
		System.out.println(sl);
		
		System.out.println("\nSorting based on names in Alphabetical order: ");
		
		Collections.sort(sl, (s1,s2) -> s1.name.compareTo(s2.name)); // comparing based on name in alphabetical order
		
		System.out.println(sl);
		
		System.out.println("\nSorting based on Marks: ");
		
		Collections.sort(sl, (s1,s2) -> s1.marks - s2.marks);
		
		System.out.println(sl);
	}

}
