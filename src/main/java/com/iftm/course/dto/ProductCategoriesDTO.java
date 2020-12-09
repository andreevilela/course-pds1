package com.iftm.course.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.iftm.course.entities.Product;

public class ProductCategoriesDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String description;
	private Double price;
	private String imgURL;
	
	List<CategoryDTO> categories = new ArrayList<>();

	public ProductCategoriesDTO() {
	}

	public ProductCategoriesDTO(String name, String description, Double price, String imgURL) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.imgURL = imgURL;
	}
	
	public ProductCategoriesDTO(Product entity) {
		setName(entity.getName());
		setDescription(entity.getDescription());
		setPrice(entity.getPrice());
		setImgURL(entity.getImgURL());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public List<CategoryDTO> getCategories() {
		return categories;
	}

	
	public Product toEntity() {
		return new Product(null, name, description, price, imgURL);
	}
	
	

}
