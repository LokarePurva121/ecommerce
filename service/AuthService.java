package com.citiustech.it.SalesProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.citiustech.it.SalesProject.exceptions.CutomerNotFound;
import com.citiustech.it.SalesProject.exceptions.LoginFailedException;
import com.citiustech.it.SalesProject.model.Customers;
import com.citiustech.it.SalesProject.repository.CustomerRepository;

@Service
public class AuthService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@PostMapping
	public void Login(Customers c) throws CutomerNotFound{
//		System.out.println("SDFGHJ");
		Customers dbCustomer = customerRepository.findByCustId(c.getCustId());
		
		 if(dbCustomer != null){
	            if(dbCustomer.getPwd().compareTo(c.getPwd()) == 0){
	                
	            }else{
	                throw new LoginFailedException("The username or password is incorrect..!");
	            }
	        }else{
	            throw new CutomerNotFound("Customer not found with id:- " + c.getCustId());
	        }
	}
	
	
	
}
