package com.citiustech.it.SalesProject.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.citiustech.it.SalesProject.model.Products;
import com.citiustech.it.SalesProject.service.ProductService;

//@CrossOrigin
@EnableWebMvc
@RestController
@RequestMapping("products")
@CrossOrigin(origins="http://127.0.0.1:5501")
public class ProductController {

	@Autowired
	private ProductService productService;
	@GetMapping(value="all", produces="application/json")
	public Collection<Products> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@PostMapping(value="save", consumes="application/json")
	public void saveProduct(@RequestBody Products products){
		productService.saveProduct(products);
	}
	
	@PutMapping(value="update/{id}", consumes="application/json")
	public void updateProduct(@PathVariable int id, @RequestBody Products products){
		productService.updateProduct(id, products);
	}
	
	@DeleteMapping(value="delete/{id}", consumes="application/json")
	public void deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
	}
	
}
