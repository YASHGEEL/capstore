package com.capgemini.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class OrderDetails 
{
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  int id;
	 
	  Date startTime;
		
	  Date endTime;
		
	  String status;
	  
	  float amount;
	  
	  int quantity;
	  
	  @OneToOne()
	  Customer customer;
	  
	  @OneToMany(targetEntity=Product.class)
	  List product;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List getProduct() {
		return product;
	}

	public void setProduct(List product) {
		this.product = product;
	}

	public OrderDetails(int id, Date startTime, Date endTime, String status, float amount, int quantity,
			Customer customer, List product) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.status = status;
		this.amount = amount;
		this.quantity = quantity;
		this.customer = customer;
		this.product = product;
	}

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", status=" + status
				+ ", amount=" + amount + ", quantity=" + quantity + ", customer=" + customer + ", product=" + product
				+ "]";
	}
	  
	  
}
