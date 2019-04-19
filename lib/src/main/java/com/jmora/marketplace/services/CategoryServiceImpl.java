package com.jmora.marketplace.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jmora.marketplace.domain.Category;
import com.jmora.marketplace.mapper.CategoryMapper;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Resource
	private CategoryMapper categoryMapper;

	@Override
	public List<Category> fetchAll() {
		return categoryMapper.fetchAll();
	}

}
