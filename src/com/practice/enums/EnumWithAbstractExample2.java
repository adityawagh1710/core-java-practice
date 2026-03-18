package com.practice.enums;

enum PaymentMethod {
	CREDIT_CARD {
		public void pay(double amount) {
			System.out.println("Paid " + amount + " using Credit Card");
		}
	},
	UPI {
		public void pay(double amount) {
			System.out.println("Paid " + amount + " using UPI");
		}
	};
	
	public abstract void pay(double amount);
}

public class EnumWithAbstractExample2 {
	public static void main(String[] args) {
		PaymentMethod.CREDIT_CARD.pay(100);
		PaymentMethod.UPI.pay(101);
	}
}
