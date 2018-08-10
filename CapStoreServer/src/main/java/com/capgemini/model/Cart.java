package com.capgemini.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class Cart 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	Date startTime;
	
	Date endTime;
	
	@OneToMany(targetEntity=Product.class)
	List product;
	
	int quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List getProduct() {
		return product;
	}

	public void setProduct(List product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	
	
	public Cart(int id, Date startTime, Date endTime, List product, int quantity) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.product = product;
		this.quantity = quantity;
	}

	
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", product=" + product
				+ ", quantity=" + quantity + "]";
	}
	
	
	
}
