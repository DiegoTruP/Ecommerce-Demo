package com.java.training.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.training.dao.CartDao;
import com.java.training.entity.Cart;
import com.java.training.entity.Product;

@Repository
public class CartDaoImpl implements CartDao{
	
	static Map<Integer, Cart> cartList = new HashMap<Integer,Cart>();
	static Integer cartCounter = 0;

	@Override
	public Cart getCart(Integer userId) {
		return cartList.get(userId);
	}

	@Override
	public void addProduct(Integer userId, Product product) {
		Cart cart = getCart(userId);
		Product newProduct = new Product();
		newProduct.setProductId(product.getProductId());
		newProduct.setProductName(product.getProductName());
		newProduct.setProductCategory(product.getProductCategory());
		newProduct.setProductPrice(product.getProductPrice());
		newProduct.setProductQuantity(1);
		
		if(cart!= null) {
			boolean exist=false;
//			for(String p : cart.getQuantityList().keySet()) {
//				if(p.equals(product.getProductName())) {
//					int quantity = cart.getQuantityList().get(p) + 1;
//					cart.getQuantityList().replace(p, quantity);
//					exist=true;
//				}
//			}
			
			for(Product p : cart.getProductList()) {
				if(p.getProductId()==newProduct.getProductId()) {
					int quantity = p.getProductQuantity()+1;
					p.setProductQuantity(quantity);
					exist=true;
				}
			}
			
			
			
			if(!exist) {
			cart.getQuantityList().put(product.getProductName(),1);
			cart.getProductList().add(newProduct);
			}
			
			
			
		}else {
			cart = new Cart();
			cart.setUserId(userId);
			cart.getQuantityList().put(product.getProductName(),1);
			cart.getProductList().add(newProduct);
			cartCounter++;
			cart.setCartId(cartCounter);
			cartList.put(userId, cart);
		}
		
		System.out.println(cartList.get(userId).getProductList().size());
		for(Product prod : cartList.get(userId).getProductList()) {
			System.out.println(prod.getProductName());
		}
	}

	@Override
	public List<Product> getProducts(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buyCart(Integer userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCard(Integer user) {
		cartList.remove(user);
	}

}
