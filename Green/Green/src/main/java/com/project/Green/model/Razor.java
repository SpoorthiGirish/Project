package com.project.Green.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "razor")
public class Razor {
	
	@Id
	private Integer id;
	
	private String brand;
	
	private String razorname;
	
	private Integer price;
	
	private String razordescription;

	public Razor() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getRazorname() {
		return razorname;
	}

	public void setRazorname(String razorname) {
		this.razorname = razorname;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getRazordescription() {
		return razordescription;
	}

	public void setRazordescription(String razordescription) {
		this.razordescription = razordescription;
	}

}
