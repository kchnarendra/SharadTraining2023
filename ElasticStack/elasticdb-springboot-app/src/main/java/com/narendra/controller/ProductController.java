package com.narendra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.narendra.dao.ProductRepo;
import com.narendra.entity.Product;

@RestController
@RequestMapping("/elastic-api")
public class ProductController {

	@Autowired
	ProductRepo productRepo;
	
	@GetMapping("/findall")
	public Iterable<Product> getProduct() {
		return productRepo.findAll();
	}
	
	@PostMapping("/insert")
	public Product inserProduct(@RequestBody Product product) {
		return productRepo.save(product);
	}
}
