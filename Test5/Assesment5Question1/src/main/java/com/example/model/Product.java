package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	private long id;
	private String name;
	private int qty;
	private String brand;
	
	
	public Product() {
		super();
	}


	public Product(long id, String name, int qty, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.brand = brand;
	}

    @Id
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", brand=" + brand + "]";
	}
	
	
	

}
