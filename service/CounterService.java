package com.citiustech.it.SalesProject.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citiustech.it.SalesProject.model.Counter;
import com.citiustech.it.SalesProject.repository.CounterRepository;


@Service
public class CounterService {
    
    @Autowired
    private CounterRepository counterRepository;
    
    public Counter getCounter(String name){
        Counter counters = counterRepository.findByCounterName(name);
        return counters;
    }
    
    public Counter getOrderCounter(){
        Counter counters = counterRepository.findByCounterName("orders");
        return counters;
    }



   public Counter getProductCounter(){
        Counter counters = counterRepository.findByCounterName("products");
        return counters;
    }



   
    public int getNextValueofOrders(Counter counters){
//        return counter.getVal() + 1001;
        return counters.getCounterValue()+1001;
    }
    
    public int getNextValueofProducts(Counter counters){
        return counters.getCounterValue() + 301;
    }
    
    public void incrementCounter(Counter counters){
        counters.setCounterValue(counters.getCounterValue() + 1);
        counterRepository.save(counters);
    }
}