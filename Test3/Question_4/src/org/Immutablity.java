package org;

import java.util.Map;

public final class Immutablity {

	private final String name;
	private final int age;
	private final String place;
	
private static Immutablity obj = new Immutablity("Spoorthi",12,"Blr");

	
	public static Immutablity getObject() {
		return obj;
	}
	public Immutablity(String name, int age, String place) {
		super();
		this.name = name;
		this.age = age;
		this.place = place;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPlace() {
		return place;
	}

	
	
}
