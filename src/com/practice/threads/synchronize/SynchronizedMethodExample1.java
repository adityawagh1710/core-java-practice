package com.practice.threads.synchronize;

public class SynchronizedMethodExample1 {
	static int count = 0;
	
	public static synchronized void increment() {
		count++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Runnable task = () -> {
			System.out.println("Inside thread: " + Thread.currentThread().getName());
			for (int i = 0; i < 1000; i++) increment();
		};
		
		Thread t1 = new Thread(task);
		t1.setName("Thread 1");
		Thread t2 = new Thread(task);
		t2.setName("Thread 2");
		t1.start();
		t1.join();
		System.out.println("Count: " + count);
		t2.start();
		t2.join();
		System.out.println("Count: " + count);
	}
}
