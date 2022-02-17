package com.java.training.dto;

import java.util.List;

import com.java.training.entity.Product;

public class BuyProduct {
	private Integer userId;
	private Integer cartId;
	private List<Product> productList;
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	

}
