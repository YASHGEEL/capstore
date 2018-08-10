package com.capgemini.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class WishList 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	Date startTime;
	
	Date endTime;
	
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

	public List getProduct() {
		return product;
	}

	public void setProduct(List product) {
		this.product = product;
	}

	public WishList(int id, Date startTime, Date endTime, List product) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.product = product;
	}

	public WishList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "WishList [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", product=" + product
				+ "]";
	}
	
	
}
