package com.citiustech.it.SalesProject.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citiustech.it.SalesProject.model.Customers;
import com.citiustech.it.SalesProject.model.Products;
import com.citiustech.it.SalesProject.repository.CustomerRepository;

@Service
public class CustomersService {



   @Autowired
    private CustomerRepository customersRepository;
         
    
    @Transactional
    public void saveCustomer(Customers customer){
        customersRepository.save(customer);
        
    }
    
    
    @Transactional
    public Customers getCustomer(String s){
 
        return customersRepository.findByCustId(s);
       
    }
    
  
	public List<Customers> getAllCustomers(){
		List<Customers> customers1 = new ArrayList<Customers>();
		customersRepository.findAll().forEach(customers1::add);
		System.out.println(customers1);
		return customers1;
	}
    
}