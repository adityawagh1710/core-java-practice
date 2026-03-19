package com.practice.threads;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread running");
	}
}

public class BasicThreadsExample1 {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
	}
}
