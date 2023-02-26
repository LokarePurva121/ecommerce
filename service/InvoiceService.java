package com.citiustech.it.SalesProject.service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citiustech.it.SalesProject.model.Customers;
import com.citiustech.it.SalesProject.model.Invoice;
import com.citiustech.it.SalesProject.model.Products;
import com.citiustech.it.SalesProject.repository.InvoiceDAO;

@Service
public class InvoiceService {

	 	@Autowired
	    private InvoiceDAO invoiceDAO;
	    
	    public Collection<Invoice> getAllInvoices(String cust_id){
	    	return invoiceDAO.getAllInvoicesforCustId(cust_id);
	    }
	
//	    public Invoice getInvoice(){
//	    	return invoiceDAO.get
//	    }
}
