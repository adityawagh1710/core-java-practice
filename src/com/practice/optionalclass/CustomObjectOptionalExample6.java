package com.practice.optionalclass;

import java.util.Optional;

interface DiscountService {
	double discount(Order order);
}

class Order {
	
	private double amount;
	
	public Order(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double applyDiscount() {
		return this.getAmount() * 0.9;
	}
}

public class CustomObjectOptionalExample6 {
	
	public static void main(String[] args) {
		
		DiscountService discountService = Order::applyDiscount;
		
		Optional<Order> order = Optional.of(new Order(100));
		
		double discount = order
				.map(discountService::discount)
				.orElse(0.0);
		
		System.out.println(discount);
	}
}
