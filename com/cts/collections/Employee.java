package com.cts.collections;


public class Employee {
	
	String name;
	int empId;
	Double salary;
	
	public Employee(String name, int empId, Double salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}


	public int getEmpId() {
		return empId;
	}


	public Double getSalary() {
		return salary;
	}


	@Override
	public String toString() {
		return "\nname=" + name + ", empId=" + empId + ", salary=" + salary ;
	}


}
