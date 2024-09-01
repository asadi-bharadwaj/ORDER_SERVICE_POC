package com.order.service;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.Request.OrderRequest;
import com.order.Request.OrderResponse;
import com.order.model.Order;
import com.order.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	public Long placeOrder(OrderRequest orderRequest) {
		// -> we can call the MenuService to block our products(to reduce the
		// quantity)

		Order order = Order.builder()
				.customerId(orderRequest.getCustomerId())
				.orderDate(Instant.now())
				.orderStatus(orderRequest.getOrderStatus())
				.totalamount(orderRequest.getTotalamount())
				.shippingAddress(orderRequest.getShippingAddress())
				.bilingAddress(orderRequest.getBilingAddress())
				.paymentMethod(orderRequest.getPaymentMethod())
				.shippingMethod(orderRequest.getShippingMethod())
				.discount(orderRequest.getDiscount())
				.productName(orderRequest.getProductName())
				.quantity(orderRequest.getQuantity())
				.build();
		order=orderRepository.save(order);
		return order.getOrderId();
		
		// need to call the paymentService to complete the payment. ->success ->
	}

	public OrderResponse getOrdeDetails(long orderId) {
		Order order = orderRepository.findById(orderId).orElseThrow(
				() -> new NullPointerException());

		OrderResponse orderResponse = OrderResponse.builder().orderId(order.getOrderId()).orderStatus(order.getOrderStatus())
				.totalamount(order.getTotalamount()).orderDate(order.getOrderDate()).build();
		return orderResponse;
	}

}
