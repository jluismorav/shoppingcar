package com.jmora.marketplace.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jmora.marketplace.domain.ShoppingCar;
import com.jmora.marketplace.mapper.ShoppingCarMapper;

@Service("shoppingCarService")
public class ShoppingCarServiceImpl implements ShoppingCarService {

	@Resource
	private ShoppingCarMapper shoppingCarMapper;

	@Override
	public List<ShoppingCar> fetchAll() {

		return shoppingCarMapper.fetchAll();
	}

	@Override
	public void insert(ShoppingCar shoppingCar) {

		 shoppingCarMapper.insert(shoppingCar);
	}

	@Override
	public void delete(ShoppingCar shoppingCar) {
		shoppingCarMapper.delete(shoppingCar);
		
	}

}
