package com.yash.products.REstProduct.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Entity
@Table(name="product")
public class Product {

	@NotNull(message = "product id cannot be null")
	@Id
	@Column(name="product_id")
	private Integer productId;
	
	@Size(min = 4, max = 20, message = "Product name length is not valid")
	@Column(name="product_name")
	private String productName;

	@Column(name="quantity")
	private Integer quantity;
	
	@PositiveOrZero(message="product price must be positive")
	@Column(name="product_price")
	private Double productPrice;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public Product(@NotNull(message = "product id cannot be null") Integer productId,
			@Size(min = 5, max = 20, message = "Product name length is not valid") String productName,
			@NotEmpty(message = "quantity can't be empty") Integer quantity,
			@PositiveOrZero(message = "product price must be positive") Double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.productPrice = productPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
