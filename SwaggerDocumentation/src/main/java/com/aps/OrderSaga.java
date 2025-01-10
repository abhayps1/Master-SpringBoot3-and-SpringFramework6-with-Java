package com.aps;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.modelling.saga.EndSaga;
import org.axonframework.modelling.saga.SagaEventHandler;
import org.axonframework.modelling.saga.StartSaga;
import org.axonframework.spring.stereotype.Saga;
import org.springframework.beans.factory.annotation.Autowired;

@Saga
public class OrderSaga {

	@Autowired
	private transient CommandGateway commandGateway;

	@StartSaga
	@SagaEventHandler(associationProperty = "orderId")
	public void handle(OrderCreatedEvent event) {
		// Start saga flow
		System.out.println("Saga started for order: " + event.getOrderId());
		// Call other services or emit commands
	}

	@EndSaga
	@SagaEventHandler(associationProperty = "orderId")
	public void handle(OrderCompletedEvent event) {
		System.out.println("Saga completed for order: " + event.getOrderId());
	}
}
