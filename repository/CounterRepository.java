package com.citiustech.it.SalesProject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.citiustech.it.SalesProject.model.Counter;

@Repository
public interface CounterRepository extends CrudRepository<Counter, Integer> {
    Counter findByCounterName(String name);
}