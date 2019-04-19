package com.jmora.marketplace.mapper;

import java.util.List;

import com.jmora.marketplace.domain.Product;

/**
 * Representation of the ProductMapper.xml file
 * 
 * @category Mapper
 * @author joseluismoravilladiego
 *
 */
public interface ProductMapper {

	List<Product> fetchAll();

	Product fetch(Integer id);

	List<Product> findCodeLikeOrNameLikeOrCategory(Product product);
}
