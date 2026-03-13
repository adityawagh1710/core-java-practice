package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingExample {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		Collections.sort(cars);  // Sort cars
		
		for (String i : cars) {
			System.out.println(i);
		}
	}
}
