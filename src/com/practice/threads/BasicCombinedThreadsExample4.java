package com.practice.threads;

import java.time.LocalDateTime;

class OrderProcessor implements Runnable {
	
	private int orderId;
	
	OrderProcessor(int orderId) {
		this.orderId = orderId;
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	@Override
	public void run() {
		LocalDateTime myObj = LocalDateTime.now();
		
		System.out.println("Order " + this.getOrderId() + " started by "
				+ Thread.currentThread().getName() + " at " + myObj);
		
		try {
			Thread.sleep(3000); // simulate processing
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
		
		System.out.println("Order " + this.getOrderId() + " completed by "
				+ Thread.currentThread().getName() + " at " + myObj);
	}
}

public class BasicCombinedThreadsExample4 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new OrderProcessor(101));
		Thread t2 = new Thread(new OrderProcessor(102));
		
		t1.setName("Order-Thread-1");
		t2.setName("Order-Thread-2");
		
		t1.start();
		t2.start();
	}
}