package com.costumes.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Stock {
	
	@Id
	private int id;
	private int quantity;
	private String material;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="colour code")
	private Payment ref;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Payment getRef() {
		return ref;
	}

	public void setRef(Payment ref) {
		this.ref = ref;
	}

	public Stock(int id, int quantity, String material, Payment ref) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.material = material;
		this.ref = ref;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", quantity=" + quantity + ", material=" + material + ", ref=" + ref + "]";
	}

	public Stock() {
		super();
	}
	
	
	
}
	