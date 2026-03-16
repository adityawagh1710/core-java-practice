package com.practice.interfaces.methodref;

@FunctionalInterface
interface EmployeeComparator {
	boolean compare(Employee e1, Employee e2);
}

class Employee {
	
	String name;
	
	Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean compareName(Employee other) {
		return this.getName().equals(other.getName());
	}
}

public class CustomArbitraryObjectDemo2 {
	
	public static void main(String[] args) {
		
		EmployeeComparator comparator = Employee::compareName;
		
		Employee e1 = new Employee("Aditya");
		Employee e2 = new Employee("Aditya");
		
		System.out.println(comparator.compare(e1, e2));
	}
	
}
