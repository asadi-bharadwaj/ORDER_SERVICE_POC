package com.order.model;

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
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrderItems {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@Column(name = "QUANTITY")
	private int quantity;
}
