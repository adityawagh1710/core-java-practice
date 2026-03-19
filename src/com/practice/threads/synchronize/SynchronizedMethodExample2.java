package com.practice.threads.synchronize;

class BankAccount {
	private int balance = 1000;
	
	synchronized void withdraw(String user, int amount) {
		if (balance >= amount) {
			System.out.println(user + " withdrawing " + amount);
			balance -= amount;
			System.out.println("Remaining: " + balance);
		} else {
			System.out.println("Insufficient balance for " + user);
		}
	}
}

public class SynchronizedMethodExample2 {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		
		Runnable task = () -> acc.withdraw(Thread.currentThread().getName(), 700);
		
		new Thread(task, "User1").start();
		new Thread(task, "User2").start();
	}
}
