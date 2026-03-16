package com.practice.interfaces.predefined;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		int[] numbers = {5, 12, 7, 20, 3, 15};
		
		Predicate<Integer> greaterThan10 = n -> n > 10;
		
		for (int num : numbers) {
			if (greaterThan10.test(num)) {
				System.out.println(num);
			}
		}
	}
}