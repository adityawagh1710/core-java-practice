package com.practice.interfaces.predefined;

import java.time.LocalTime;
import java.util.Random;
import java.util.function.Supplier;

class Product {
	
	String name;
	double price;
	
	Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}

public class SupplierExample1 {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hello";
		System.out.println(supplier.get());
		
		Supplier<Integer> randomNumber = () -> new Random().nextInt(100);
		System.out.println(randomNumber.get());
		System.out.println(randomNumber.get());
		
		
		Supplier<Product> ProductSupplier = () -> new Product("Laptop", 100.0);
		System.out.println(ProductSupplier.get());
		
		Supplier<LocalTime> StartTime = LocalTime::now;
		System.out.println(StartTime.get());
	}
}
