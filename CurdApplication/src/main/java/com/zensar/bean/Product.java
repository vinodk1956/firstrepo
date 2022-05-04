package com.zensar.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double price;
	private double discountPercentage;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Product(int id, String name, double price, double discountPercentage, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discountPercentage = discountPercentage;
		this.description = description;
	}
	public Product(String name, double price, double discountPercentage, String description) {
		super();
		this.name = name;
		this.price = price;
		this.discountPercentage = discountPercentage;
		this.description = description;
	}
	public Product(int id) {
		super();
		this.id = id;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", discountPercentage="
				+ discountPercentage + ", description=" + description + "]";
	}
	
	
}
