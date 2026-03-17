package com.practice.optional;

import java.util.Optional;

class UserService {
	
	public Optional<String> findUserEmail(int userId) {
		
		if (userId == 1) {
			return Optional.of("aditya@gmail.com");
		}
		
		return Optional.empty();
	}
}

public class OptionalExample1 {
	
	public static void main(String[] args) {
		
		UserService service = new UserService();
		
		Optional<String> email = service.findUserEmail(1);
		
		String result = email.orElse("Email not found " + 1);
		
		System.out.println(result);
		
		Optional<String> email2 = service.findUserEmail(2);
		
		String result2 = email2.orElse("Email not found " + 2);
		
		System.out.println(result2);
	}
}