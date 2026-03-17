package com.practice.stream;

import java.util.List;

class Employee {
	int id;
	String name;
	String department;
	double salary;
	
	Employee(int id, String name, String department, double salary) {
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

public class CustomClassStreamExample2 {
	
	public static void main(String[] args) {
		
		List<Employee> employees = List.of(
				new Employee(1, "Simran", "IT", 60000),
				new Employee(2, "Neha", "HR", 40000),
				new Employee(3, "Raj", "IT", 80000),
				new Employee(4, "Amit", "Finance", 50000)
		);
		
		System.out.println("Salary >50000 Results:");
		employees.stream().filter(employee -> employee.getSalary() > 50000).forEach(System.out::println);
		
		System.out.println("Sorted names:");
		employees.stream().map(Employee::getName).sorted().forEach(System.out::println);
		
		System.out.println("Highest Salary");
		Employee emp = employees.stream()
				.max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
				.orElse(null);
		System.out.println(emp);
		
		System.out.println("Employees sorted by highest Salary");
		employees.stream()
				.sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
				.forEach(System.out::println);
	}
}
