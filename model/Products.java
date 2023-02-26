package com.citiustech.it.SalesProject.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products {

	private int pno;
	private double price;
	private int stock;
	
	public Products() {
		
	}
	
	public Products(int pno, double price, int stock) {
		this.pno = pno;
		this.price = price;
		this.stock = stock;
	}

	@Id
	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Products [pno=" + pno + ", price=" + price + ", stock=" + stock + "]";
	}
	
	
	
}
