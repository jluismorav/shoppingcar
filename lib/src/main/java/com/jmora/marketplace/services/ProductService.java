package com.jmora.marketplace.services;

import java.util.List;

import com.jmora.marketplace.domain.Product;

public interface ProductService {

	List<Product> fetchAll();

	Product fetch(Integer id);

	List<Product> findCodeLikeOrNameLikeOrCategory(Product product);
}
