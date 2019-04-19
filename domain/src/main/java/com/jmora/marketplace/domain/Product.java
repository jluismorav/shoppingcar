package com.jmora.marketplace.domain;

/**
 * Entity that represent the item of {@link ShoppingCar} or of item in the MarketPlace
 * 
 * @category Domain
 * @author joseluismoravilladiego
 *
 */
public class Product extends Entity {

	private static final long serialVersionUID = 5643297627774920051L;
	private Integer id;
	private String code;
	private String name;
	private Category category;
	private Double price;
	private String description;

	public Product() {
		
	}

	public Product(String code, String name, Category category) {
		this.code = code;
		this.name = name;
		this.category=category;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
