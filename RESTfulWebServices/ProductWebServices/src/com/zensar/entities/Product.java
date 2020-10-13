package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement; 
 
/*
 * Author: SHIVAM SHUKLA
 * Creation Date: 25th July 2019 5.55PM
 * Modified Date: 26th July 2019 9.50AM
 * Version: 2.0
 * Copyright: Zensar Technologies. Alll rights reserved. 
 * Description: Represents business entity product.
 * It is persistent class of hibernate,
 * value object of application,
 * domain or application object.
 * It is also POJO. 
 * */
@Entity
@Table(name="PRODUCT")
public class Product 
{
	@Id
	//@GeneratedValue
	@Column(name="ID")
	private int productId;
	private String name;
	private String brand;
	private double price;

	public Product(int productId, String name, String brand, double price) 
	{
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
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
		return brand;
	}
 
	public void setBrand(String brand) {
		this.brand = brand;
	}
 
	public double getPrice() {
		return price;
	}
 
	public void setPrice(double price) {
		this.price = price;
	}
 
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
 
 
 
}