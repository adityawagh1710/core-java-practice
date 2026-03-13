package com.practice.collections.map;

import java.util.Objects;

public class Order {
	private int oid;
	private String name;
	private double price;       // total price of order
	private int noOfItems;      // can be derived from set size, but sometimes stored
	
	public Order(int oid, String name, double price, int noOfItems) {
		this.oid = oid;
		this.name = name;
		this.price = price;
		this.noOfItems = noOfItems;
	}
	
	public void setOid(int oid) {
		this.oid = oid;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getNoOfItems() {
		return noOfItems;
	}
	
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Order order = (Order) o;
		
		return oid == order.oid;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(oid);
	}
	
	@Override
	public String toString() {
		return "Order{oid=" + oid + ", name='" + name + "', price=" + price +
				", noOfItems=" + noOfItems + "}";
	}
}
