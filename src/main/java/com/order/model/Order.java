package com.order.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Author: Bharadwaj
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;
	@Column(name = "CUSTOMER_ID")
	private long customerId;
	@Column(name = "ORDER_DATE")
	private LocalDateTime orderDate;
	@Column(name = "ORDER_STATUS")
	private String orderStatus;
	@Column(name = "TOTAL_AMOUNT")
	private BigDecimal totalamount;
	private String shippingAddress;
	@Column(name = "BILLING_ADDRESS")
	private String bilingAddress;
	@Column(name = "PAYMENT_METHOD")
	private String paymentMethod;
	@Column(name = "SHIPPING_METHOD")
	private String shippingMethod;
	@Column(name = "DISCOUNT")
	private BigDecimal discount;
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@Column(name = "QUANTITY")
	private int quantity;
	
}
