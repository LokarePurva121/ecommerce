package com.citiustech.it.SalesProject.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.citiustech.it.SalesProject.model.Customers;
import com.citiustech.it.SalesProject.model.Invoice;

@Repository
public class InvoiceDAO {

	@Autowired
    private JdbcTemplate jdbcTemplate;
 
 	private Customers customer;
    
    public Collection<Invoice> getAllInvoicesforCustId(String cust_id){
    	return jdbcTemplate.query("Select ord_no, ord_date, cust_Id, pno,qty, amt from Invoices Where cust_Id = ?", new BeanPropertyRowMapper<Invoice>(Invoice.class),cust_id);
    	
    }

}
