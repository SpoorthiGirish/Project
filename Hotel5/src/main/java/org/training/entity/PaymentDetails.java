package org.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Object relational Model of payment details entity

@Entity
@Table(name="booking")
public class PaymentDetails {
	
	@Id
	@Column(name="email")
	private String email;
	

	@Column(name="hotelname")
	private String hotelname;
	
	@Column(name="rooms")
	private String rooms;
	
	@Column(name="price")
	private String price;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public String getRooms() {
		return rooms;
	}

	public void setRooms(String rooms) {
		this.rooms = rooms;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public PaymentDetails(String email, String hotelname, String rooms, String price) {
		super();
		this.email = email;
		this.hotelname = hotelname;
		this.rooms = rooms;
		this.price = price;
	}

	public PaymentDetails() {
		super();
	}

	@Override
	public String toString() {
		return "PaymentDetails [email=" + email + ", hotelname=" + hotelname + ", rooms=" + rooms + ", price=" + price
				+ "]";
	}
	
	

}
