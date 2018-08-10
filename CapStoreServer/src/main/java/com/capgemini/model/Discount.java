package com.capgemini.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Discount 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	Date startTime;
	
	Date endTime;
	
	@OneToOne()
	Product product;
	
	int discountPercentage;

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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public Discount(int id, Date startTime, Date endTime, Product product, int discountPercentage) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.product = product;
		this.discountPercentage = discountPercentage;
	}

	public Discount() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Discount [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", product=" + product
				+ ", discountPercentage=" + discountPercentage + "]";
	}
	
	
}
