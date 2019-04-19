package com.jmora.marketplace.mapper;

import java.util.List;

import com.jmora.marketplace.domain.ShoppingCar;


/**
 * Representation of the ShoppingCarMapper.xml file
 * 
 * @category Mapper
 * @author joseluismoravilladiego
 *
 */
public interface ShoppingCarMapper {

	List<ShoppingCar> fetchAll();

	void insert(ShoppingCar shoppingCar);

	void delete(ShoppingCar shoppingCar);

}
