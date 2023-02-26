package com.citiustech.it.SalesProject.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citiustech.it.SalesProject.model.Counter;
import com.citiustech.it.SalesProject.model.Customers;
import com.citiustech.it.SalesProject.model.Orders;
import com.citiustech.it.SalesProject.model.Products;
import com.citiustech.it.SalesProject.repository.CustomerRepository;
import com.citiustech.it.SalesProject.repository.OrderRepository;
import com.citiustech.it.SalesProject.repository.ProductRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository ordersRepository;
    
    @Autowired
    private CounterService counterService;
    
    @Autowired
    private ProductRepository productRepository;
    
    @Autowired
    private CustomerRepository customerRepository;
    
    //get all orderss
    public List<Orders> getAllorderss(){
        List<Orders> orderslist = new ArrayList<Orders>();
        ordersRepository.findAll().forEach(orderslist::add);
        return orderslist;
    }
    
    //get orders by ordersid
    public Orders getordersByid(int oid){
        Optional<Orders> ord = ordersRepository.findById(oid);
        Orders ords = ord.get();
        return ords;
    }
    
    //get all orderss of a customer
    public Collection<Orders> getorderssofCustomer(String cid){
        Customers c = new Customers();
        c.setCustId(cid);
        return ordersRepository.findByCustomers(c);
    }
    
    //get all orderss of a product
    public Collection<Orders> getorderssofProduct(int pid){
        Products p = new Products();
        p.setPno(pid);
        return ordersRepository.findByProducts(p);
    }
    
    public Orders saveorders(Orders orderss){
        Counter counters = counterService.getOrderCounter();
        Optional<Products> products = productRepository.findById(orderss.getProducts().getPno());
        Products ptds = products.get();
        if(ptds.getStock() > orderss.getQty()){
            Optional<Customers> customers = customerRepository.findById(orderss.getCustomers().getCustId());
//        	Optional<Customers> customers = customerRepository.find
            Customers ctr = customers.get();
            if(ctr.getCredit() > orderss.getQty()*ptds.getPrice()){
                orderss.setOrd_no(counterService.getNextValueofOrders(counters));
                orderss.setOrd_date(LocalDate.now());
                orderss.setCustomers(ctr);
                orderss.setProducts(ptds);
                
                System.out.println(orderss);
                ordersRepository.save(orderss);
                
                //to reduce stock of product
                ptds.setStock(ptds.getStock()-orderss.getQty());
                productRepository.save(ptds);
                
                //to change customers credit
                ctr.setCredit(ctr.getCredit()-orderss.getQty()*ptds.getPrice());
                customerRepository.save(ctr);
                
                //increament counter
                counterService.incrementCounter(counters);
            }else{
                System.out.println("Insufficient Balance.....");
            }
        }else{
            System.out.println("Insufficient Stock...");
        }
        return orderss;
    }
    
}
