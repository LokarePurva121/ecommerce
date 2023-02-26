package com.citiustech.it.SalesProject.controller;

import java.util.HashMap;
import java.util.Map;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.citiustech.it.SalesProject.exceptions.CutomerNotFound;
import com.citiustech.it.SalesProject.model.Customers;
import com.citiustech.it.SalesProject.repository.CustomerRepository;
import com.citiustech.it.SalesProject.service.AuthService;

@EnableWebMvc
@RestController
@RequestMapping("auth")
@CrossOrigin(origins="http://127.0.0.1:5501")
public class AuthenticationController {

	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
    private AuthService authService;
	
	@PostMapping(value="login", consumes="application/json")
    private ResponseEntity<?> login(@RequestBody Customers c) throws CutomerNotFound{
        authService.Login(c);
        Map<String, String> info = new HashMap<>();
        info.put("CustomerId", c.getCustId());
        return new ResponseEntity<>(info , HttpStatus.OK);
    }
	
}
