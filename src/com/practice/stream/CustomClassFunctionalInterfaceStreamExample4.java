package com.practice.stream;

import java.util.List;
import java.util.Optional;

@FunctionalInterface
interface EmployeeFinder {
	Optional<Employee2> find(List<Employee2> list);
}

@FunctionalInterface
interface FindByName {
	Optional<Employee2> find(List<Employee2> list, String name);
}

class Employee2 {
	int id;
	String name;
	String department;
	double salary;
	
	Employee2(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return name + " - " + department + " - " + salary;
	}
}

public class CustomClassFunctionalInterfaceStreamExample4 {
	
	public static void main(String[] args) {
		
		List<Employee2> employees = List.of(
				new Employee2(1, "Simran", "IT", 60000),
				new Employee2(2, "Neha", "HR", 40000),
				new Employee2(3, "Raj", "IT", 80000),
				new Employee2(4, "Amit", "Finance", 50000)
		);
		
		// EmployeeFinder functional interface
		EmployeeFinder highestSalaryFinder = (list) -> list
						.stream()
						.max((e1, e2) -> Double.compare(e1.salary, e2.salary));
		
		// EmployeeFinder functional interface using optional
		Optional<Employee2> result = highestSalaryFinder.find(employees);
		
		result.ifPresent(emp -> System.out.println("Highest Paid: " + emp.getName()));
		
		
		// FindByName functional interface using filter and findFirst
		FindByName finder = (list, name) -> list.stream()
						.filter(e -> e.getName().equalsIgnoreCase(name))
						.findFirst();
		
		finder.find(employees, "Raj")
				.ifPresentOrElse(
						e -> System.out.println("Found: " + e),
						() -> System.out.println("Not Found")
				);
	}
}
