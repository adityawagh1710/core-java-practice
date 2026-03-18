package com.practice.stream.collectors.demo1;

public class Order {
	private final int id;
	private final Product product;
	private final int quantity;
	private OrderStatus status;
	
	public Order(int id, Product product, int quantity, OrderStatus status) {
		this.id       = id;
		this.product  = product;
		this.quantity = quantity;
		this.status   = status;
	}
	
	public int getId() {
		return id;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public double getTotal() {
		return product.price() * quantity;
	}
	
	@Override
	public String toString() {
		return "Order#" + id + " [" + product.name() + " x" + quantity + " | " + status + " | ₹" + getTotal() + "]";
	}
}
