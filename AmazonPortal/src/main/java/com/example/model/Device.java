package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Device {
    @Id
	String name;
	String type;
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
	public Device(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public Device() {
		super();
		
	}
	@Override
	public String toString() {
		return "Device [name=" + name + ", type=" + type + "]";
	}
	
}
