package com.jmora.marketplace.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jmora.marketplace.domain.Product;
import com.jmora.marketplace.mapper.ProductMapper;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Resource
	private ProductMapper productMapper;

	@Override
	public List<Product> fetchAll() {
		return productMapper.fetchAll();
	}

	@Override
	public Product fetch(Integer id) {
		return productMapper.fetch(id);
	}

	@Override
	public List<Product> findCodeLikeOrNameLikeOrCategory(Product product) {

		return productMapper.findCodeLikeOrNameLikeOrCategory(product);
	}

}
