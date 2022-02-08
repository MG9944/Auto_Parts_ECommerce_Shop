package com.autoparts.eshop.service;

import com.autoparts.eshop.model.Article;
import com.autoparts.eshop.model.CartItem;
import com.autoparts.eshop.model.ShoppingCart;
import com.autoparts.eshop.model.User;


public interface ShoppingCartService {

	ShoppingCart getShoppingCart(User user);
	
	int getItemsNumber(User user);
	
	CartItem findCartItemById(Long cartItemId);
	
	CartItem addArticleToShoppingCart(Article article, User user, int qty);
		
	void clearShoppingCart(User user);
	
	void updateCartItem(CartItem cartItem, Integer qty);

	void removeCartItem(CartItem cartItem);
	
}
