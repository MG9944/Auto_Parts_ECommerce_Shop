package com.autoparts.eshop.service;

import java.util.List;

import com.autoparts.eshop.model.Order;
import com.autoparts.eshop.model.Payment;
import com.autoparts.eshop.model.Shipping;
import com.autoparts.eshop.model.ShoppingCart;
import com.autoparts.eshop.model.User;

public interface OrderService {

	Order createOrder(ShoppingCart shoppingCart, Shipping shippingAddress, Payment payment, User user);
	
	List<Order> findByUser(User user);
	
	Order findOrderWithDetails(Long id);
}
