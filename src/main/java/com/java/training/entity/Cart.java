package com.java.training.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Cart {
	

	public Map<String, Integer> getQuantityList() {
		return quantityList;
	}
	public void setQuantityList(Map<String, Integer> quantityList) {
		this.quantityList = quantityList;
	}
	private Integer cartId;
	private List<Product> productList = new ArrayList<Product>();
	private Map<String,Integer> quantityList =new HashMap<String,Integer>();
	private Integer userId;
	
	
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
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}
