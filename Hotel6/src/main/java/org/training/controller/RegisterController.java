package org.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.training.entity.User;
import org.training.service.UserService;

@RestController
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public ModelAndView registerPage(ModelAndView modelAndView, User user) {
		modelAndView.addObject("user", user);
		modelAndView.setViewName("register");
		return modelAndView;
	}
	
	//registration of user
	@PostMapping("/register")
	public ModelAndView processingRegistrationForm(ModelAndView modelAndView,@ModelAttribute User user) {
	
		
		System.out.println("username: " + user.getName());
		
		userService.saveUser(user);
		
		modelAndView.setViewName("redirect:/login");
		return modelAndView;
		
	}

}

//setViewName - Set a view name for this ModelAndView, to be resolved by the DispatcherServlet via a ViewResolver.Will override any pre-existing view name or View.
//It sets the name of the view to be resolved by the configured ViewResolver. So let's say your view is in /WEB-INF/views/vendorInfo.jsp and view resolver is configured with prefix /WEB-INF/views/ and suffix .jsp, then the view resolver will know to use the prefix + viewName + suffix as the view that will be rendered.

//@ModelAttribute is an annotation that binds a method parameter or method return value to a named model attribute, and then exposes it to a web view.