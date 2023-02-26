package com.citiustech.it.SalesProject.controller;



import java.util.Collection;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.citiustech.it.SalesProject.model.Orders;
import com.citiustech.it.SalesProject.service.OrderService;


@RestController
@EnableWebMvc
@RequestMapping("orders")
@CrossOrigin(origins="http://127.0.0.1:5501/")
public class OrderController {



   @Autowired
    private OrderService orderService;
    
    @GetMapping(value="all", produces="application/json")
    public List<Orders> getAllOrders(){
        return orderService.getAllorderss();
    }
    
    @GetMapping(value="get/{id}", produces="application/json")
    public Orders getOrderByid(@PathVariable int id){
        return orderService.getordersByid(id);
    }
    
    @GetMapping(value="customer/{id}", produces="application/json")
    public Collection<Orders> getOrdersofCustomer(@PathVariable String id){
        return orderService.getorderssofCustomer(id);
    }
    
    @GetMapping(value="product/{id}", produces="application/json")
    public Collection<Orders> getOrdersofProduct(@PathVariable int id){
        return orderService.getorderssofProduct(id);
    }
    
    @PostMapping(value="place", consumes="application/json")
    public Orders saveOrder(@RequestBody Orders orders){
    	System.out.println(orders);
        return orderService.saveorders(orders);
    }
}