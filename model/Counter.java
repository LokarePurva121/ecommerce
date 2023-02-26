package com.citiustech.it.SalesProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Counters")
public class Counter {

	private String counterName;
	private int counterValue;
	
	public Counter() {
		
	}
	
	public Counter(String counterName, int counterValue) {
		
		this.counterName = counterName;
		this.counterValue = counterValue;
	}

	@Id
	@Column(name="ctr_name")
	public String getCounterName() {
		return counterName;
	}


	public void setCounterName(String counterName) {
		this.counterName = counterName;
	}


	@Column(name="cur_val")
	public int getCounterValue() {
		return counterValue;
	}


	public void setCounterValue(int counterValue) {
		this.counterValue = counterValue;
	}


	@Override
	public String toString() {
		return "Counter [counterName=" + counterName + ", counterValue=" + counterValue + "]";
	}
	
	
	
	
}
