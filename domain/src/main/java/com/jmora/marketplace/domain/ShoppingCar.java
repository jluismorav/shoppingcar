package com.jmora.marketplace.domain;

/**
 * Entity that represent the action of put {@link Product} to buy
 * 
 * @category Domain
 * @author joseluismoravilladiego
 *
 */

public class ShoppingCar extends Entity {

	private static final long serialVersionUID = -7161508574004923889L;
	private Integer id;
	private Product product;

	public ShoppingCar() {

	}

	public ShoppingCar(Product product) {
		super();
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
