package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	List<String> razor=new ArrayList();
	public  MainController(){
		razor.add("Gillette");
		razor.add("Philips");
		razor.add("Samsung");
		razor.add("Merkur");
		
	}

	 @GetMapping(value="/get")
	 public List<String> getMethod()
	 {
		return razor;
		 
	 }
	
	 @GetMapping(value="/getString")
	 public String getStringMethod()
	 {
		return "Razor's are available";
		 
	 }
	 @PostMapping(value="/post")//update
	 public void postMethod()
	 {
		
		 razor.add(3, "Bic Twin");
	 }
	 @PutMapping(value="/put")
	 public void putMethod()
	 {
		 razor.add("Harrys");
	 }
	 @DeleteMapping(value="/delete")
	 public void deleteMethod()
	 {
		 razor.remove(2);
	 }

	
}

