package com.jmora.marketplace.viewmodel;

import java.util.List;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;

import com.jmora.marketplace.domain.Category;
import com.jmora.marketplace.domain.Product;
import com.jmora.marketplace.domain.ShoppingCar;
import com.jmora.marketplace.services.CategoryService;
import com.jmora.marketplace.services.ProductService;
import com.jmora.marketplace.services.ShoppingCarService;

/**
 * Class that controls the index.zul page
 * 
 * @category Controller
 * @author joseluismoravilladiego
 *
 */
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class ShoppingCarVM {

	@WireVariable
	private ProductService productService;
	@WireVariable
	private CategoryService categoryService;
	@WireVariable
	private ShoppingCarService shoppingCarService;

	private List<Product> products;
	private List<Category> categories;
	private Category selectedCategory;

	private String code = "";
	private String name = "";

	private List<ShoppingCar> listProductInShoopingCar;

	private Double total = null;

	@Init
	public void init() {
		products = productService.fetchAll();
		categories = categoryService.fetchAll();
		categories.add(0, new Category()); /* Item not selected */
		listProductInShoopingCar = shoppingCarService.fetchAll();

	}

	@Command
	@NotifyChange("products")
	public void search() {
		String codeSeach = null;
		String nameSeach = null;
		if (!code.isEmpty()) {
			codeSeach = "%" + code + "%";
		}
		if (!name.isEmpty()) {
			nameSeach = "%" + name + "%";
		}

		products = productService.findCodeLikeOrNameLikeOrCategory(new Product(codeSeach, nameSeach, selectedCategory));
	}

	@Command
	@NotifyChange({ "listProductInShoopingCar", "total" })
	public void addShoppingCar(@BindingParam("param") Product item) {
		ShoppingCar shoppingCar = new ShoppingCar(item);
		if (listProductInShoopingCar.add(shoppingCar)) {
			shoppingCarService.insert(shoppingCar);
		}

	}

	@Command
	@NotifyChange({ "listProductInShoopingCar", "total" })
	public void removeShoppingCar(@BindingParam("param") ShoppingCar item) {

		if (listProductInShoopingCar.remove(item)) {
			shoppingCarService.delete(item);
		}

	}

	/*
	 * 
	 * Get and set that are required to make the binding
	 */

	public List<Product> getProducts() {
		return products;

	}

	public void setProducts(List<Product> products) {
		this.products = products;
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

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public Category getSelectedCategory() {
		return selectedCategory;
	}

	public void setSelectedCategory(Category selectedCategory) {
		this.selectedCategory = selectedCategory;
	}

	public List<ShoppingCar> getListProductInShoopingCar() {
		return listProductInShoopingCar;
	}

	public void setListProductInShoopingCar(List<ShoppingCar> listProductInShoopingCar) {
		this.listProductInShoopingCar = listProductInShoopingCar;
	}

	public Double getTotal() {
		total = listProductInShoopingCar.stream().mapToDouble(e -> e.getProduct().getPrice()).sum();
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}
