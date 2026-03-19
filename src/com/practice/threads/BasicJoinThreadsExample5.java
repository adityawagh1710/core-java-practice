package com.practice.threads;

public class BasicJoinThreadsExample5 {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(() -> {
			System.out.println("Worker thread doing work...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}
			System.out.println("Worker thread done.");
		});
		
		t.start();
		t.join(); // Main thread waits for t to finish
		System.out.println("Main thread continues after worker.");
	}
}
