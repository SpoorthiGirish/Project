package org.training.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.training.entity.Hotel;
import org.training.service.HotelService;


@RestController 
public class HotelController {
	
	@Autowired //injecting the service functionality without instantiating
	private HotelService service;
	
	@GetMapping(value="/hotels")  
	 public List<Hotel> getHotel() {
		return service.getHotel();
	 }
	

}
