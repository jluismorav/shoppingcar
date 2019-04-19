package com.jmora.marketplace.mapper;

import java.util.List;

import com.jmora.marketplace.domain.Category;

/**
 * Representation of the CategoryMapper.xml file
 * 
 * @category Mapper
 * @author joseluismoravilladiego
 *
 */
public interface CategoryMapper {

	List<Category> fetchAll();

}
