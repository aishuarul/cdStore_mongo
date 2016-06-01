package com.ottawau.cdstore.dao;

import com.ottawau.cdstore.viewModel.Cart;

public class CartManager {
	public static Cart cart;
	public Cart processCart(Cart cart) {
		System.out.println("inside CartManager");
		return cart;
	}
}
