package com.citiustech.it.SalesProject.model;


import java.time.LocalDate;

import javax.xml.crypto.Data;

public class Invoice {
	
	private int ord_no;
	private LocalDate ord_date;
	private String cust_id;
	private int pno;
	private int qty;
	private double amt;
	
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
	
	public String getCust_id() {
		return cust_id;
	}
	
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	
	public int getPno() {
		return pno;
	}
	
	public void setPno(int pno) {
		this.pno = pno;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public double getAmt() {
		return amt;
	}
	
	public void setAmt(double amt) {
		this.amt = amt;
	}
}
