package com.practice.threads;

class Task implements Runnable {
	private String taskName;
	
	Task(String taskName) {
		this.taskName = taskName;
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	// run() → contains business logic
	@Override
	public void run() {
		System.out.println(this.getTaskName() + " started by " + Thread.currentThread().getName());
	}
}


public class BasicRunnableThreadsExample2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Task("Download File"));
		Thread t2 = new Thread(new Task("Process Data"));
		// start() → creates new thread
		t1.start();
		t2.start();
	}
}
