package com.jmora.marketplace.services;

import java.util.List;

import com.jmora.marketplace.domain.ShoppingCar;

public interface ShoppingCarService {

	List<ShoppingCar> fetchAll();

	void insert(ShoppingCar shoppingCar);

	void delete(ShoppingCar shoppingCar);

}
