package com.jmora.marketplace.domain;

/**
 * Entity that represent the Category of {@link Product}
 * 
 * @category Domain
 * @author joseluismoravilladiego
 *
 */

public class Category extends Entity {

	private static final long serialVersionUID = -5033129000964970694L;

	private Integer id;
	private String code;
	private String name;
	
	public Category() {
	
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
