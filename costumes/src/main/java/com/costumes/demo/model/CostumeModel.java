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
	private String brand;
	private String size;
	private String colour;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public CostumeModel(int customerid, String name, int quantity, int cost, String brand, String size, String colour) {
		super();
		this.customerid = customerid;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.brand = brand;
		this.size = size;
		this.colour = colour;
	}
	public CostumeModel() {
		super();
	}
	@Override
	public String toString() {
		return "CostumeModel [customerid=" + customerid + ", name=" + name + ", quantity=" + quantity + ", cost=" + cost
				+ ", brand=" + brand + ", size=" + size + ", colour=" + colour + "]";
	}
	

}
