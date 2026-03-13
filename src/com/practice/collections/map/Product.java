package com.practice.collections.map;

import java.util.Objects;

class Product {
	private int pid;
	private String name;
	private double price;
	
	public Product(int pid, String name, double price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	
	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Product product = (Product) o;
		return this.getPid() == product.getPid();   // or pid + name, depending on business rule
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getPid());    // must match equals()
	}
	
	@Override
	public String toString() {
		return "(" + this.getPid() + ", " + this.getName() + ", " + this.getPrice() + ")";
	}
}
