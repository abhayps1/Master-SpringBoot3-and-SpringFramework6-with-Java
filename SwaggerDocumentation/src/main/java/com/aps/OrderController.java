package com.aps;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/orders")
@Tag(name = "Order Saga API", description = "Endpoints for managing order saga flow")
public class OrderController {

	@Autowired
	private CommandGateway commandGateway;

	@PostMapping
	@Operation(summary = "Create a new order")
	public String createOrder(@RequestBody CreateOrderCommand command) {
		commandGateway.send(new OrderCreatedEvent(command.getOrderId(), command.getProduct(), command.getQuantity()));
		return "Order saga initiated successfully!";
	}
}
