package com.costumes.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CostumeModel {
	
	@Id
	private int customerid;
	private String name;
	private int quantity;
	private int cost;
	CostumeModel(){}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public CostumeModel(int customerid, String name, int quantity, int cost) {
		super();
		this.customerid = customerid;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
	}
	
	

}
