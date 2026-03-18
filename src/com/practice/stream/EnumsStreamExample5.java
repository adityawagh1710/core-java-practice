package com.practice.stream;

import java.util.List;

enum Department {
	IT, HR, SALES
}

class Employee3 {
	String name;
	Department dept;
	double salary;
	
	Employee3(String name, Department dept, double salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Department getDept() {
		return dept;
	}
	
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "name: " + name + ", dept: " + dept + ", salary: " + salary;
	}
}

public class EnumsStreamExample5 {
	
	public static void main(String[] args) {
	
		List<Employee3> employee3s = List.of(
				new Employee3("Aditya", Department.IT,  80000),
				new Employee3("Mark", Department.HR,  60000),
				new Employee3("Justin", Department.SALES,  70000)
		);
		
		employee3s.stream()
				.filter(e -> e.getDept() == Department.SALES && e.getSalary() > 60000)
				.forEach(e -> System.out.println(e.getName()));
	}
	
}
