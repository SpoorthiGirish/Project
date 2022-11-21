package com.example.model;

import java.util.List;

public class Devices {

	String brandname;
	List<Device> devices;
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public List<Device> getDevices() {
		return devices;
	}
	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
	public Devices(String brandname, List<Device> devices) {
		super();
		this.brandname = brandname;
		this.devices = devices;
	}
	public Devices() {
		super();
		
	}
	@Override
	public String toString() {
		return "Devices [brandname=" + brandname + ", devices=" + devices + "]";
	}
	
	
}
