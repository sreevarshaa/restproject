package com.costumes.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Payment {
	
	@Id
	private int id;
	private String name;
	private int amount;
	private String gpay;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getGpay() {
		return gpay;
	}
	public void setGpay(String gpay) {
		this.gpay = gpay;
	}
	public Payment(int id, String name, int amount, String gpay) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.gpay = gpay;
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", name=" + name + ", amount=" + amount + ", gpay=" + gpay + "]";
	}
	public Payment() {
		super();
	}
	
	

}
