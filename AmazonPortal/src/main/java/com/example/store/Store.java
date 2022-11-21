package com.example.store;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Device;
import com.example.model.Devices;

@Controller
public class Store {
	private Devices listOfDevices;

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	  @RequestMapping("/samsung") 
	  public ModelAndView samsung() 
	  { 
      ModelAndView mv=new ModelAndView("samsung"); //List<Device> SamsungList=new ArrayList<>();
	  RestTemplate rt=new RestTemplate();
	  listOfDevices=rt.getForObject("http://localhost:8088/samsung/devices",Devices.class);
	  mv.addObject("devices",listOfDevices);
	  return mv;
	  }
	 

	@RequestMapping("/apple")
	public ModelAndView apple() {
		ModelAndView mv = new ModelAndView("apple");
		RestTemplate rt = new RestTemplate();
		listOfDevices = rt.getForObject("http://localhost:8085/apple/devices", Devices.class);
		mv.addObject("devices", listOfDevices);
		return mv;
	}

}
