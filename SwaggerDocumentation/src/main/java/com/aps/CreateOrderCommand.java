package com.aps;

public class CreateOrderCommand {

	private String orderId;
	private String product;
	private int quantity;

	public CreateOrderCommand(String orderId, String product, int quantity) {
		this.orderId = orderId;
		this.product = product;
		this.quantity = quantity;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}
}
