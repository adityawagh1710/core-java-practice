package com.practice.stream.collectors.demo1;

public record Product(String name, double price, Category category) {
	@Override
	public String toString() {
		return name + " (" + category + ", ₹" + price + ")";
	}
}
