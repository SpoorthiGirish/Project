package org.sap;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MainController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String login()
	{
		return "login";
	}
	
	@GetMapping("check")
	public ModelAndView check(@RequestParam("name") String fn)
	{
		ModelAndView mv=new ModelAndView("failed");
		 String fname="upasana";
		
		 if(fname.equals(fn))
		 {
			 ModelAndView mv1=new ModelAndView("welcome"); 
			 return mv1;
		 }
		 
		return mv;
	}
	
	

}
