package com.cts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {
		
		List<Student> l = new ArrayList<>();
		
		l.add(new Student(100,"gopi",95));
		l.add(new Student(101, "vivek",87));
		l.add(new Student(102,"ram",97));
		
		System.out.println("Before sorting by marks:\n");
		System.out.println(l.toString());
		
		Collections.sort(l);
		System.out.println("After sorting by Marks:\n");
		System.out.println(l);
		
	}
}
