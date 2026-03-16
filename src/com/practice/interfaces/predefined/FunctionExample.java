package com.practice.interfaces.predefined;

import java.util.function.Function;

class Employee {
	
	String name;
	double salary;
	
	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class FunctionExample {
	public static void main(String[] args) {
		// String String
		Function<String, String> converter = String::toLowerCase;
		System.out.println(converter.apply("THIS IS FUNCTIONAL"));
		
		// Integer Integer
		Function<Integer, Integer> square = number -> number * number;
		System.out.println(square.apply(2255));
		
		// Integer Integer array
		int[] numbers = {2,4,6,8};
		Function<Integer, Integer> cube = n -> n*n*n;
		for(int num : numbers) {
			System.out.println(cube.apply(num));
		}
		
		// Class Double
		Employee emp = new Employee("Aditya", 50000);
		Function<Employee, Double> bonusCalculator = e -> e.salary * 0.10;
		double bonus = bonusCalculator.apply(emp);
		System.out.println("Bonus: " + bonus);
	}
}
