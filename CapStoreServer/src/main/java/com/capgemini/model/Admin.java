package com.capgemini.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin 
{
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  int id;
	 
	  Date startTime;
		
	  Date endTime;
	  
	  String password;
	  
	  String name;
	  
	  String email;
	  
	  String phone;

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
		
		this.startTime = Date.valueOf(LocalDate.now());
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int id, Date startTime, Date endTime, String password, String name, String email, String phone) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", password=" + password
				+ ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	  
	  
		
	 
}
