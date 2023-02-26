package com.citiustech.it.SalesProject.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citiustech.it.SalesProject.model.Products;
import com.citiustech.it.SalesProject.repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public List<Products> getAllProducts(){
		List<Products> products = new ArrayList<Products>();
		productRepository.findAll().forEach(products::add);
//		System.out.println(products);
		return products;
	}
	
	@Transactional
	public void saveProduct(Products products){
		productRepository.save(products);
	}
	
	@Transactional
	public void deleteProduct(int id){
		productRepository.deleteById(id);
	}
	
	@Transactional
	public void updateProduct(int id, Products products){
		productRepository.save(products);
	}
	
}