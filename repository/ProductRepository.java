package com.citiustech.it.SalesProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.citiustech.it.SalesProject.model.Customers;
import com.citiustech.it.SalesProject.model.Products;

@Repository
public interface ProductRepository extends CrudRepository<Products, Integer>{

//		Customers findByCustId(String id);
	
}
