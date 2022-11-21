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
public class AdminLoginControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void getadminLoginPage_works() throws Exception {

		mvc.perform(get("/adminlogin"))
		.andExpect(view().name("adminlogin"));
		
	}
	
	@Test
	public void adminLogin_works() throws Exception {

		mvc.perform(post("/adminlogin")
				.param("username", "Manager")
				.param("password", "root"))
		.andExpect(view().name("redirect:/addNewHotel"));
		
	}
	
	/*@Test
	public void adminLogin_error() throws Exception {

		mvc.perform(post("/adminlogin")
				.param("email", "kadhu@gmail.com")
				.param("password", "abcd"))
		.andExpect(view().name("adminlogin"))
		.andExpect(model().attribute("error", "Your password is wrong, Please enter correct login details"));
		
	}*/
	
	

}