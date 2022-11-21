package com.training;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.training.Hotel6Application;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = Hotel6Application.class)
@AutoConfigureMockMvc
public class AddNewHotelControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void getaddHotelPage_works() throws Exception {

		mvc.perform(get("/addHotel"))
		.andExpect(view().name("addHotel"));
		
	}
	
	@Test
	public void addHotel_works() throws Exception {

		mvc.perform(post("/addHotel")
				
				.param("hotelname", "Taj"))
		
		.andExpect(view().name("addHotel"));
		
	}
	
}
