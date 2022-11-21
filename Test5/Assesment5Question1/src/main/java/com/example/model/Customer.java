package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	
	private long id;
	private String name;
	private String type;
	private String address;
	
	
	public Customer() {
		super();
	}


	public Customer(long id, String name, String type, String address) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.address = address;
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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", type=" + type + ", address=" + address + "]";
	}
	
	
	
	
}
