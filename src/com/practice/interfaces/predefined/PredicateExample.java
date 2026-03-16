package com.practice.interfaces.predefined;

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
		
		Predicate<Integer> isEven = n -> n % 2 == 0;
		Predicate<Integer> isPositive = n -> n > 0;
		// Combining predicates
		Predicate<Integer> positiveEven = isPositive.and(isEven);
		Predicate<Integer> negative = isPositive.negate();
		Predicate<Integer> oddOrNegative = isEven.negate().or(negative);
		
		int[] values = { -6, -3, -1, 0, 2, 4, 7, 9, 11, 13 };
		
		System.out.println("Positive even numbers:");
		for (int v : values) {
			if (positiveEven.test(v)) {
				System.out.println(v);
			}
		}
		
		System.out.println("\nNegative numbers:");
		for (int v : values) {
			if (negative.test(v)) {
				System.out.println(v);
			}
		}
		
		System.out.println("\nOdd OR negative numbers:");
		for (int v : values) {
			if (oddOrNegative.test(v)) {
				System.out.println(v);
			}
		}
	}
}