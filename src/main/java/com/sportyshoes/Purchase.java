package com.sportyshoes;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class Purchase {
private long id;
private long user_id;
private long product_id;
private Category category;
private int quantity;
private Date createdAt;
private Date updatedAt;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public long getUser_id() {
	return user_id;
}
public void setUser_id(long user_id) {
	this.user_id = user_id;
}
public long getProduct_id() {
	return product_id;
}
public void setProduct_id(long product_id) {
	this.product_id = product_id;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Date getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}
public Date getUpdatedAt() {
	return updatedAt;
}
public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}

}
