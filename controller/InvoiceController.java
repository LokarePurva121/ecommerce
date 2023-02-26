package com.citiustech.it.SalesProject.controller;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.citiustech.it.SalesProject.model.Customers;
import com.citiustech.it.SalesProject.model.Invoice;
import com.citiustech.it.SalesProject.service.InvoiceService;

@EnableWebMvc
@RestController
@RequestMapping("invoice")
@CrossOrigin(origins="http://127.0.0.1:5501")
public class InvoiceController {

	@Autowired
    private InvoiceService invoiceService;
    
    @GetMapping(value="get/{id}" , produces="application/json")
    public Collection<Invoice> getAllInvoices(@PathVariable String id){
        return invoiceService.getAllInvoices(id);
    }
	
  
}
