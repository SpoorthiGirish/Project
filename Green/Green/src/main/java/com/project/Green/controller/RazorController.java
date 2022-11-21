package com.project.Green.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.project.Green.model.Razor;
import com.project.Green.repository.RazorRepository;
import com.project.Green.service.RazorService;

@RestController
@RequestMapping("/razor")
public class RazorController {
	@Autowired
	private RazorRepository razorRepository;
	
	@Autowired
	private RazorService razorservice;
	
	Logger logger = LoggerFactory.getLogger(RazorController.class);
	
	
	@GetMapping("/insert")
	public void insertData() {
		//logger.info("Recived a request for getRazorDetails for "+String.valueOf(id));
		razorservice.insertData();
		//logger.info("sending response for "+String.valueOf(id));
	}
	
	@GetMapping("/read")
	public List<Razor> readData() {
		razorservice.readData();
		List<Razor> findAll = razorRepository.findAll();
		return findAll.stream().filter(razor -> !razor.getBrand().isEmpty()).collect(Collectors.toList());
	}
	
	@GetMapping("/update")
	public void updateData(@RequestBody Razor razor) {
		logger.info("Recived a request to update theRazorDetails for "+razor.getBrand());
		razorservice.updateData();
		logger.info("Razor detailsupdated successfully for  "+razor.getBrand());
		
	}
	
	@GetMapping("/delete")
	public void deleteData() {
		razorservice.deleteData();
	}
	
	@GetMapping("/{id}")
	public Razor getRazorDetails(@PathVariable int id) {
		logger.info("Recived a request for getRazorDetails for "+String.valueOf(id));
		Optional<Razor> findById = razorRepository.findById(id);
		if(!findById.isPresent()) {
			logger.error("Razor details NOTFOUND for "+String.valueOf(id));
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Data Not Found");
		}
		logger.info("sending response for "+findById.get().getBrand());
		return findById.get();
	}

	@PostMapping("/save")
	public Razor addRazor(@RequestBody Razor razor) {
		logger.info("Recived a request to post theRazorDetails for "+razor.getBrand());
		Razor save = razorRepository.save(razor);
		logger.info("Razor details saved successfully for  "+razor.getBrand());
		
		return save;	
	}
	
	@DeleteMapping("/{id}")
	public String deleteRazorDetails(@PathVariable int id) {
		logger.info("Recived a request to delete theRazorDetails for "+String.valueOf(id));
		Optional<Razor> findById = razorRepository.findById(id);
		if(!findById.isPresent()) {
			logger.error("Razor details NOTFOUND for "+String.valueOf(id));
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Data Not Found");
		}
		logger.info("Deleting the razor details for "+findById.get().getBrand());
			
		razorRepository.delete(findById.get());
		return "deleted";
	}
	
	@GetMapping("/razors")
	public List<Razor> getRazors() {
		List<Razor> findAll = razorRepository.findAll();
		return findAll.stream().filter(razor -> !razor.getBrand().isEmpty()).collect(Collectors.toList());
	}

}
