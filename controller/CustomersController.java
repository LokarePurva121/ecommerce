package com.citiustech.it.SalesProject.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.citiustech.it.SalesProject.model.Customers;
import com.citiustech.it.SalesProject.model.Products;
import com.citiustech.it.SalesProject.service.CustomersService;
import com.citiustech.it.SalesProject.service.ProductService;

@EnableWebMvc
@RestController
@RequestMapping("/customers")
@CrossOrigin(origins="http://127.0.0.1:5501")
public class CustomersController {
    
    @Autowired
    private CustomersService customerService;


   @PostMapping(value="save",consumes="application/json")
    public void saveCustomer(@RequestBody Customers customer){
        customerService.saveCustomer(customer);
    }
    
    @GetMapping(value="get/{cid}" , produces="application/json")
    public Customers getCustomer(@PathVariable String cid){
        return customerService.getCustomer(cid);
    }
	
	@GetMapping(value="all", produces="application/json")
	public Collection<Customers> getAllCustomer(){
		return customerService.getAllCustomers();
	}

}