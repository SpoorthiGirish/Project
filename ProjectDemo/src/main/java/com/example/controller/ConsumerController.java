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
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.ResourceNotFoundException;
import com.example.model.Consumer;
import com.example.repo.ConsumerRepository;



@RestController
public class ConsumerController {

	 @Autowired
		private ConsumerRepository consRepo;
		
		@GetMapping(value="/consumers")
		public List<Consumer> getAllConsumers()
		{
			return consRepo.findAll();
			//must fetch from database
		}
		
		@PostMapping(value="/addconsumer")
		public Consumer createConsumer(@RequestBody Consumer consumer)
		{
			return consRepo.save(consumer) ;
			
		}
		
		@PutMapping(value="/updateconsumer/{id}")
		public ResponseEntity<Consumer> updateConsumer(@PathVariable(value="id")  long consId,@RequestBody Consumer consumer)
		{
			Consumer cons=null;
			try {
				cons=consRepo.findById(consId).orElseThrow(()->new ResourceNotFoundException("Consumer not found"+consId));
			}
			catch(ResourceNotFoundException e){
				e.printStackTrace();
			}
			
			cons.setName(consumer.getName());
			cons.setAge(consumer.getAge());
			cons.setAddress(consumer.getAddress());
			Consumer updatedCustomer=consRepo.save(cons);
			return ResponseEntity.ok(updatedCustomer);
			
		}
		
		@DeleteMapping(value="/deleteconsumer/{id}")
		public Map<String,Boolean> deleteCustomer(@PathVariable(value="id")  long consId)
		{
			Consumer cons=null;
			try {
				cons=consRepo.findById(consId).orElseThrow(()->new ResourceNotFoundException("Customer not found"+consId));
			}catch(ResourceNotFoundException e)
			{
				e.printStackTrace();
			}
			consRepo.delete(cons);
			Map<String,Boolean> response=new HashMap<>();
			response.put("Yes deleted", Boolean.TRUE);
			return response;
		}
		 
	

}
