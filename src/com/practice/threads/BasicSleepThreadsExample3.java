package com.practice.threads;

class ApiCaller implements Runnable {
	
	/* Used in: Retry mechanisms, Polling systems, Rate limiting */
	@Override
	public void run() {
		for (int i = 0; i <= 3; i++) {
			System.out.println("Calling API " + i + " by " + Thread.currentThread().getName());
			try {
				Thread.sleep(2000); // wait 1 sec
			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}
	}
}

public class BasicSleepThreadsExample3 {
	public static void main(String[] args) {
		new Thread(new ApiCaller()).start();
	}
}
