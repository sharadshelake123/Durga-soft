package com.mtm.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Customer {
	@Id
	private Integer customerId;
	@Column(length = 10)
	private String customerName;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "CUSTOMER_ITEMS", joinColumns = @JoinColumn(name = "CUSTOMERID_FK"), inverseJoinColumns = @JoinColumn(name = "ITEMID_FK"))
	private List<Item> items;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}