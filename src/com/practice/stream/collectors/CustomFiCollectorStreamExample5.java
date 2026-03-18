package com.practice.stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@FunctionalInterface
interface SalaryFilter {
	boolean filter(Employee emp);
}

class Employee {
	String name;
	int salary;
	
	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
}

public class CustomFiCollectorStreamExample5 {
	
	public static void main(String[] args) {
		List<Employee> employees = List.of(
				new Employee("Amit", 50000),
				new Employee("Rahul", 70000),
				new Employee("Neha", 40000),
				new Employee("Amit", 90000)
		);
		
		SalaryFilter salaryFilter = emp -> emp.getSalary() > 5000;
		
		List<String> employeesList = employees
				.stream()
				.filter(salaryFilter::filter)
				.map(Employee::getName)
				.collect(Collectors.toList());
				
		System.out.println(employeesList);
		
		Map<String, Integer> employeesList2 = employees
				.stream()
				.filter(salaryFilter::filter)
				.collect(
						Collectors.toMap(
								Employee::getName,
								Employee::getSalary,
								(oldValue, newValue) -> newValue
						)
				);
		
		System.out.println(employeesList2);
		
		Map<String, List<Integer>> employeesList3 = employees
				.stream()
				.collect(
						Collectors.groupingBy(
								Employee::getName,
								Collectors.mapping(Employee::getSalary, Collectors.toList())
						)
				);
		
		System.out.println(employeesList3);
		
		List<String> employeesList4 = employees
				.stream()
				.filter(emp -> emp.getSalary() > 50000)
				.map(emp -> emp.getName() + " earns " + emp.getSalary())
				.distinct()
				.toList();
		
		System.out.println(employeesList4);
	}
}
