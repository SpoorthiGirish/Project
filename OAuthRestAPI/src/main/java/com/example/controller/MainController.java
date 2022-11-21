package com.example.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	List<String> course=new ArrayList();
	public  MainController(){
		course.add("java");
		course.add("python");
		course.add("ruby");
		course.add("pearl");
		
	}

	 @RequestMapping(value="/get")
	 public List<String> getMethod()
	 {
		return course;
		 
	 }
	
	 @RequestMapping(value="/getString")
	 public String getStringMethod()
	 {
		return "iam getting a String";
		 
	 }
//	 @PostMapping(value="/post")//update
//	 public void postMethod()
//	 {
//		
//		 course.add(3, "c#");
//	 }
//	 @PutMapping(value="/put")
//	 public void putMethod()
//	 {
//		course.add("php");
//	 }
//	 @DeleteMapping(value="/delete")
//	 public void deleteMethod()
//	 {
//		 course.remove(2);
//	 }

	
}
