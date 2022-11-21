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
public class LoginControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void getLoginPage_works() throws Exception {

		mvc.perform(get("/login"))
		.andExpect(view().name("login"));
		
	}
	
	@Test
	public void userLogin_works() throws Exception {

		mvc.perform(post("/login")
				.param("email", "kunda@gmail.com")
				.param("password", "Kunda1234"))
		.andExpect(view().name("redirect:/home"));
		
	}
	
	@Test
	public void userLogin_error() throws Exception {

		mvc.perform(post("/login")
				.param("email", "kunda@gmail.com")
				.param("password", "abcd"))
		.andExpect(view().name("login"))
		.andExpect(model().attribute("error","Your password is wrong, Please enter correct login details" ));
		
	}
	
	

}
