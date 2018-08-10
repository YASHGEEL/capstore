package com.capgemini.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FeedBack
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	Date startTime;
	
	Date endTime;
	
	@OneToOne()
	Customer customer;
	
	String comment;
	
	int rating;

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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public FeedBack(int id, Date startTime, Date endTime, Customer customer, String comment, int rating) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.customer = customer;
		this.comment = comment;
		this.rating = rating;
	}

	public FeedBack() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FeedBack [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", customer=" + customer
				+ ", comment=" + comment + ", rating=" + rating + "]";
	}
	
	
}
