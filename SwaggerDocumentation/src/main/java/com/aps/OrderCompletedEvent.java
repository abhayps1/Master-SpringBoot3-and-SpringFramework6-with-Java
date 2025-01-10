package com.aps;

public class OrderCompletedEvent {

	private String orderId;

	public OrderCompletedEvent(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderId() {
		return orderId;
	}
}
