package com.citiustech.it.SalesProject.repository;

import java.util.Collection;

import javax.persistence.criteria.Order;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.citiustech.it.SalesProject.model.Customers;
import com.citiustech.it.SalesProject.model.Orders;
import com.citiustech.it.SalesProject.model.Products;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Integer> {
    Collection<Orders> findByCustomers(Customers c);
    Collection<Orders> findByProducts(Products p);
}