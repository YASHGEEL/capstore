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
public class Product 
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
 
  Date startTime;
	
  Date endTime;
	
  String name;
  
  String description;
  
  float cost;
  
  String status;
  
  int quantity;
  
  String imageUrl;
  
  int viewCount;
  
  @OneToOne()
  Merchant merchant;
  
  @OneToOne()
  Discount discount;
  
  @OneToOne()
  Category category;
  
  @OneToMany(cascade=CascadeType.ALL , targetEntity=FeedBack.class)
  List feedback;

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

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public float getCost() {
	return cost;
}

public void setCost(float cost) {
	this.cost = cost;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public String getImageUrl() {
	return imageUrl;
}

public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}

public int getViewCount() {
	return viewCount;
}

public void setViewCount(int viewCount) {
	this.viewCount = viewCount;
}

public Merchant getMerchant() {
	return merchant;
}

public void setMerchant(Merchant merchant) {
	this.merchant = merchant;
}

public Discount getDiscount() {
	return discount;
}

public void setDiscount(Discount discount) {
	this.discount = discount;
}

public Category getCategory() {
	return category;
}

public void setCategory(Category category) {
	this.category = category;
}

public List getFeedback() {
	return feedback;
}

public void setFeedback(List feedback) {
	this.feedback = feedback;
}

public Product(int id, Date startTime, Date endTime, String name, String description, float cost, String status,
		int quantity, String imageUrl, int viewCount, Merchant merchant, Discount discount, Category category,
		List feedback) {
	super();
	this.id = id;
	this.startTime = startTime;
	this.endTime = endTime;
	this.name = name;
	this.description = description;
	this.cost = cost;
	this.status = status;
	this.quantity = quantity;
	this.imageUrl = imageUrl;
	this.viewCount = viewCount;
	this.merchant = merchant;
	this.discount = discount;
	this.category = category;
	this.feedback = feedback;
}

public Product() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Product [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", name=" + name
			+ ", description=" + description + ", cost=" + cost + ", status=" + status + ", quantity=" + quantity
			+ ", imageUrl=" + imageUrl + ", viewCount=" + viewCount + ", merchant=" + merchant + ", discount="
			+ discount + ", category=" + category + ", feedback=" + feedback + "]";
}
  
  
}