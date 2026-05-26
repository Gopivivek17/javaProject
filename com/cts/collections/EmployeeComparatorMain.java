package com.cts.collections;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparatorMain {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Gopi vivek",32896,100000.0));
		emp.add(new Employee("Ram",32815,150000.0));
		emp.add(new Employee("Akhil",32800,200000.0));
		
		System.out.println(emp);
		Collections.sort(emp,new EmployeeNameComparator());
		
		System.out.println("Sorting using Name Comparator: \n");
		
		System.out.println(emp);
		
	}
}
