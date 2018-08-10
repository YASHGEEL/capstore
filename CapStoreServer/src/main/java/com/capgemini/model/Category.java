package com.capgemini.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	Date startTime;
	
	Date endTime;
	
	String name;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", name=" + name + "]";
	}

	public Category(int id, Date startTime, Date endTime, String name) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.name = name;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
