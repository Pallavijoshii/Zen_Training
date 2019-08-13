package com.phoenix.shop.entities;


public class Product {

	private int productId;
	private String name;
	private String Brand;
	private float price;
	public Product(int productId, String name, String brand, float price) {
		super();
		this.productId = productId;
		this.name = name;
		Brand = brand;
		this.price = price;
	}
	

	public Product()
	{
		
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBrand() {
		return Brand;
	}


	public void setBrand(String brand) {
		Brand = brand;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", Brand=" + Brand + ", price=" + price + "]";
	}
	
	
}
