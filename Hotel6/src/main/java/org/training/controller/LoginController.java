package org.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.training.entity.User;
import org.training.repository.UserRepository;
import org.training.service.UserService;

@RestController
public class LoginController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
	public ModelAndView loginPage2() {

		return new ModelAndView("login");
	}

	@GetMapping("/login")
	public ModelAndView loginPage() {

		return new ModelAndView("login");
	}

	// logging in customer
	@PostMapping("/login")
	public ModelAndView processingLoginForm(ModelAndView model, @RequestParam String email,
			@RequestParam String password, ModelMap models) {
		
		try {
			boolean status = userService.validate(email, password);
			User user = userRepository.findByEmail(email);
			System.out.println("checking");
			System.out.println(user);
			System.out.println("login status:" + status);
			if (status == true) {
				System.out.println(user.getUsername());
				model.setViewName("redirect:/home");
				return model;
			} else {
				models.addAttribute("error", "Your password is wrong, Please enter correct login details");
				model.setViewName("login");
				return model;
			}
		} catch (java.util.NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("email not found");
			models.addAttribute("error", "Your mail is wrong, Please enter correct login details");
			model.setViewName("login");
			return model;
		}

	}

	@GetMapping("/logout")
	public ModelAndView logoutPage() {

		return new ModelAndView("redirect:/login");
	}

}



//ModelMap is also used to pass values to render a view.
//The advantage of ModelMap is it gives us the ability to pass a collection of values and treat these values as if they were within a Map:

//modelandview - The final interface to pass values to a view is the ModelAndView.
//This interface allows us to pass all the information required by Spring MVC in one return:
