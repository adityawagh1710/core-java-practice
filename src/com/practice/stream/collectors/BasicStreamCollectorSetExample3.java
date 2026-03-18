package com.practice.stream.collectors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BasicStreamCollectorSetExample3 {
	public static void main(String[] args) {
		List<String> emails = List.of("A@g.com", "B@g.com", "C@g.com", "D@g.com", "A@g.com");
		
		Set<String> emailsSet = emails
				.stream()
				.collect(Collectors.toSet());
		
		System.out.println(emailsSet);
	}
}
