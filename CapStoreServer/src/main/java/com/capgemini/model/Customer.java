package com.capgemini.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	Date startTime;
	
	Date endTime;
	
	String name;
	
	String address;
	
	String phone;
	
	String email;
	
	String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	Cart cart;
	
	@OneToOne(cascade = CascadeType.ALL)
	WishList wishList;
	
	String securityQuestion;
	
	String securityAnswer;
	
	String imageUrl;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public WishList getWishList() {
		return wishList;
	}

	public void setWishList(WishList wishList) {
		this.wishList = wishList;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Customer(int id, Date startTime, Date endTime, String name, String address, String phone, String email,
			String password, Cart cart, WishList wishList, String securityQuestion, String securityAnswer,
			String imageUrl) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.cart = cart;
		this.wishList = wishList;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
		this.imageUrl = imageUrl;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", name=" + name
				+ ", address=" + address + ", phone=" + phone + ", email=" + email + ", password=" + password
				+ ", cart=" + cart + ", wishList=" + wishList + ", securityQuestion=" + securityQuestion
				+ ", securityAnswer=" + securityAnswer + ", imageUrl=" + imageUrl + "]";
	}
	
	
	
}
