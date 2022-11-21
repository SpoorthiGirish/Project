package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.ResourceNotFoundException;
import com.example.model.Customer;
import com.example.repo.CustomerRepository;

@RestController
public class CustomerController {
     @Autowired
	private CustomerRepository custRepo;
	
	@GetMapping(value="/Amazon/customers")
	public List<Customer> getAllCustomers()
	{
		return custRepo.findAll();
		
	}
	
	@PostMapping(value="/Amazon/addcustomer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return custRepo.save(customer) ;
		 
	}
	
	@PutMapping(value="/Amazon/updatecustomer/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable(value="id")  long custId,@RequestBody Customer customer)
	{
		Customer cust=null;
		try {
			cust=custRepo.findById(custId).orElseThrow(()->new ResourceNotFoundException("Customer not found"+custId));
		}catch(ResourceNotFoundException e)
		{
			e.printStackTrace();
		}
		
		cust.setAddress(customer.getAddress());
		Customer updatedCustomer=custRepo.save(cust);
		return ResponseEntity.ok(updatedCustomer);
		
	}
	
	
}
