package com.practice.collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OrderSystem {
	public static void main(String[] args) {
		
		Map<Order, Set<Product>> info = new HashMap<>();
		
		Order order1 = new Order(100, "Aditya", 1000.0, 2);
		
		Set<Product> products1 = new HashSet<>();
		products1.add(new Product(1, "Phone", 500));
		products1.add(new Product(2, "Charger", 500));
		
		// Trying to add duplicate → will be ignored (because of Set + proper equals/hashCode)
		products1.add(new Product(1, "Phone", 500));
		
		info.put(order1, products1);
		
		Order order2 = new Order(101, "Amit", 2700.0, 3);
		
		Set<Product> products2 = new HashSet<>();
		products2.add(new Product(3, "Laptop", 1500));
		products2.add(new Product(4, "Mouse", 800));
		products2.add(new Product(5, "Bag", 400));
		
		info.put(order2, products2);
		
		// Print all orders and their products
		for (Map.Entry<Order, Set<Product>> entry : info.entrySet()) {
			Order ord = entry.getKey();
			
			Set<Product> prods = entry.getValue();
			
			System.out.println("Order: " + ord);
			
			System.out.println("Products (" + prods.size() + " items):");
			
			for (Product p : prods) {
				System.out.println("  → " + p);
			}
			
			System.out.println();
		}
	}
}
