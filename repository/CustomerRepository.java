package com.citiustech.it.SalesProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.citiustech.it.SalesProject.model.Customers;

public interface CustomerRepository extends JpaRepository<Customers, String>{

	Customers findByCustId(String custId);

//	   Customers findByCustId(String s);
}
