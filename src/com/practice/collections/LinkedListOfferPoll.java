package com.practice.collections;

import java.util.LinkedList;

public class LinkedListOfferPoll {
	public static void main(String[] args) {
		
		LinkedList<String> messages = new LinkedList<>();
		
		messages.offer("Hello");
		messages.offer("How are you?");
		messages.offer("Let's meet.");
		
		while(!messages.isEmpty()) { 
			System.out.println("Message: " + messages.poll());
		}
		
		messages.add("Whats your location?");
		
		System.out.println(messages);
	}
}
