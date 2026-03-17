package com.practice.optional;

import java.util.Optional;

class Employee {
	
	private Double bonus;
	
	Employee(Double bonus) {
		this.bonus = bonus;
	}
	
	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	
	public Optional<Double> getBonus() {
		return Optional.ofNullable(bonus);
	}
}

public class OptionalExample2 {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(null);
		
		double bonus = emp.getBonus().orElse(0.0);
		
		System.out.println("Bonus: " + bonus);
		
		
		Employee emp2 = new Employee(5.0);
		
		double bonus2 = emp2.getBonus().orElse(0.0);
		
		System.out.println("Bonus: " + bonus2);
	}
}