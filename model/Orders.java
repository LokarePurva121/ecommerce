package com.citiustech.it.SalesProject.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Orders {
	private int ord_no;
	private LocalDate ord_date;
	private int qty;

	public Orders() {

	}

	public Orders(int ord_no, LocalDate ord_date, int qty) {
		this.ord_no = ord_no;
		this.ord_date = ord_date;
		this.qty = qty;
	}

	@Id
	public int getOrd_no() {
		return ord_no;
	}

	public void setOrd_no(int ord_no) {
		this.ord_no = ord_no;
	}

	public LocalDate getOrd_date() {
		return ord_date;
	}

	public void setOrd_date(LocalDate ord_date) {
		this.ord_date = ord_date;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	private Customers customers;

	@ManyToOne(targetEntity = Customers.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "cust_id")
	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	private Products products;

	@ManyToOne(targetEntity = Products.class)
	@JoinColumn(name = "pno")
	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Orders [ord_no=" + ord_no + ", ord_date=" + ord_date + ", qty=" + qty + ", customers=" + customers
				+ ", products=" + products + "]";
	}

	
	
}