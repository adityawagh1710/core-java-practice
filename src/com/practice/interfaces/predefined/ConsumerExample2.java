package com.practice.interfaces.predefined;

import java.util.function.Consumer;

class Employee2 {
	
	String name;
	double salary;
	
	Employee2(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class ConsumerExample2 {
	public static void main(String[] args) {
		// Integer square
		Consumer<Integer> squarePrinter = n -> {
			System.out.println("Square: " + (n * n));
		};
		squarePrinter.accept(5);
		squarePrinter.accept(9);
		
		// 2 strings andThen
		Consumer<String> greet = name -> System.out.println("Hello " + name);
		Consumer<String> welcome = name -> System.out.println("Welcome " + name);
		Consumer<String> combined = greet.andThen(welcome);
		combined.accept("Aditya");
		
		
		// Objects
		Employee2 emp2 = new Employee2("Aditya", 60000);
		Consumer<Employee2> showEmployee = e -> System.out.println(e.getName() + " earns " + e.getSalary());
		showEmployee.accept(emp2);
	}
}
