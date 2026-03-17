package com.practice.optional;

import java.util.Optional;

import static java.lang.Math.round;

@FunctionalInterface
interface PriceCalculator {
	double calculate(Product product);
}

class Product {
	
	private double price;
	
	public Product(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double applyTax() {
		return round(this.getPrice() * 1.18);
	}
}

public class CustomObjectOptionalExample5 {
	
	public static void main(String[] args) {
		
		PriceCalculator priceCalculator = Product::applyTax;
		
		Optional<Product> product = Optional.of(new Product(100));
		
		double price = product
				.map(priceCalculator::calculate)
				.orElseThrow(() -> new RuntimeException("Product not found"));
		
		System.out.println(price);
	}

}
