package com.order.Request;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
public class OrderRequest {
	
	private long customerId;
	private Instant orderDate;
	private String orderStatus;
	private BigDecimal totalamount;
	private String shippingAddress;
	private String bilingAddress;
	private String paymentMethod;
	private String shippingMethod;
	private BigDecimal discount;
	private String productName;
	private int quantity;
}
