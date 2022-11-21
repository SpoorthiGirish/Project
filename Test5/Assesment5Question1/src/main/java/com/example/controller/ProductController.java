package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.ResourceNotFoundException;
import com.example.model.Customer;
import com.example.model.Product;
import com.example.repo.CustomerRepository;
import com.example.repo.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository prodRepo;
	
	@GetMapping(value="/Amazon/productsaccess")
	public List<Product> getAllProducts()
	{
		return prodRepo.findAll();
		
	}
	
	@PostMapping(value="/Amazon/addproduct")
	public Product addProduct(@RequestBody Product product)
	{
		return prodRepo.save(product) ;
		 
	}
	@PutMapping(value="/Amazon/updateproduct/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable(value="id")  long prodId,@RequestBody Product product)
	{
		Product prod=null;
		try {
			prod=prodRepo.findById(prodId).orElseThrow(()->new ResourceNotFoundException("Product not found"+prodId));
		}catch(ResourceNotFoundException e)
		{
			e.printStackTrace();
		}
		
		prod.setBrand(product.getBrand());
		Product updatedProduct=prodRepo.save(prod);
		return ResponseEntity.ok(updatedProduct);
		
	}
}
