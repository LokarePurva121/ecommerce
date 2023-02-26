package com.citiustech.it.SalesProject.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="customers")
public class Customers {
   private String custId;
    private String pwd;
    private String email;
    private double credit;
    
    public Customers(){
        
    }

   public Customers(String custId, String pwd, String email, double credit) {
        super();
        this.custId = custId;
        this.pwd = pwd;
        this.email = email;
        this.credit = credit;
    }



    @Id
    @Column(name="cust_id")
    public String getCustId() {
        return custId;
    }



   public void setCustId(String custId) {
        this.custId = custId;
    }
   
    @Column(name = "pwd",nullable=false)
    public String getPwd() {
        return pwd;
    }



   public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    @Column(name = "email",nullable=false)
    public String getEmail() {
        return email;
    }



   public void setEmail(String email) {
        this.email = email;
    }



   @Column(name = "credit",nullable=false)
    public double getCredit() {
        return credit;
    }



   public void setCredit(double credit) {
        this.credit = credit;
    }



   @Override
    public String toString() {
        return "Customers [custId=" + custId + ", pwd=" + pwd + ", email=" + email + ", credit=" + credit + "]";
    }
    
    
}