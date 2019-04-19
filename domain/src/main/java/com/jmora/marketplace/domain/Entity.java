package com.jmora.marketplace.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 
 * @category Domain
 * @author joseluismoravilladiego
 *
 */
public class Entity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3678064294776543194L;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
