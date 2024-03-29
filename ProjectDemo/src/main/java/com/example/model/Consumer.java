package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Consumer {

	
	private long id;
	private String name;
	private int age;
	private String address;

	
	public Consumer() {
		super();
	}



	public Consumer(long id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
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



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Consumer [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	

}
