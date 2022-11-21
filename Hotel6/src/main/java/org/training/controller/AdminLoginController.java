package org.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.training.exception.AdminCredentials;
import org.training.exception.InvalidAdminException;
import org.training.service.UserService;

@RestController
public class AdminLoginController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/adminlogin")
	public ModelAndView adminLoginPage() {
		return new ModelAndView("adminlogin");
	}
	
	
	
	//Admin login
	@PostMapping("/adminlogin")
	public ModelAndView processingAdminLoginform(ModelAndView modelAndView, @RequestParam String username, @RequestParam String password,ModelMap models) {
		AdminCredentials obj = new AdminCredentials();
		try {
			obj.checkCredentials(username, password);
			modelAndView.setViewName("redirect:/addNewHotel");
		} catch (InvalidAdminException e) {
			e.printStackTrace();
			models.addAttribute("adminerror", "Invalid admin ceredentials");
			modelAndView.setViewName("adminlogin");
		}
//		if(username.equalsIgnoreCase("Manager") && password.equalsIgnoreCase("root")) {
//			modelAndView.setViewName("redirect:/addNewHotel");
//		}
//		else {
//			models.addAttribute("adminerror", "Invalid admin ceredentials");
//			modelAndView.setViewName("adminlogin");
//		}
		return modelAndView;
	}	
}

