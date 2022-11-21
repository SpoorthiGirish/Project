package org.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//Object relational Model of Hotel entity

@Entity
@Table(name="hotel")
public class Hotel {
	
	
	@Id
	@Column(name="hotelname")
	private String hotelname;
	

	@Column(name="rooms")
	private String rooms;
	
	@Column(name="rating")
	private String rating;
	
	@Column(name="price")
	private String price;

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

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Hotel [hotelname=" + hotelname + ", rooms=" + rooms + ", rating=" + rating + ", price=" + price + "]";
	}

	public Hotel(String hotelname, String rooms, String rating, String price) {
		super();
		this.hotelname = hotelname;
		this.rooms = rooms;
		this.rating = rating;
		this.price = price;
	}

	public Hotel() {
		super();
	}


	
	
}
