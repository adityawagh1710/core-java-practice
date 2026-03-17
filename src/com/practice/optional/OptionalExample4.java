package com.practice.optional;

import java.util.Optional;

class BankAccount {
	
	private String creditCard;
	
	BankAccount(String creditCard) {
		this.creditCard = creditCard;
	}
	
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	
	public Optional<String> getCreditCard(){
		return Optional.ofNullable(creditCard);
	}
}

public class OptionalExample4 {
	
	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount(null);
		
		String card = acc.getCreditCard().orElse("No Card Linked");
		
		System.out.println(card);
		
		BankAccount acc2 = new BankAccount("visa");
		
		String card2 = acc2.getCreditCard().orElse("No Card Linked");
		
		System.out.println(card2);
	}
}
