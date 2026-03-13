package com.practice.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Mango");
		
		System.out.println(map);
		
		// Get
		String name = map.get(3);
		
		System.out.println("Fruit: " + name);
		
		// Iteration
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		// Key check
		if (map.containsKey(3)) {
			System.out.println("Key exists");
		}
		
		// Key remove
		map.remove(1);
		
		System.out.println(map);
		
		// Key put with different value
		map.put(1, "Dragon Fruit");
		
		System.out.println(map);
		
		System.out.println(map.size());
	}
}
