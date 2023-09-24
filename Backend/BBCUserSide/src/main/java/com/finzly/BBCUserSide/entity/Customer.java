package com.finzly.BBCUserSide.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customer_id;
	private String customerName;
	private String customerEmail;
	private String customerTelephoneNumber;

	public Customer() {
		super();
	}

	public Customer(String customerName, String customerEmail, String customerTelephoneNumber) {
		super();
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerTelephoneNumber = customerTelephoneNumber;
	}


	public long getCustomerId() {
		return customer_id;
	}

	public void setCustomerId(long customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerTelephoneNumber() {
		return customerTelephoneNumber;
	}

	public void setCustomerTelephoneNumber(String customerTelephoneNumber) {
		this.customerTelephoneNumber = customerTelephoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerTelephoneNumber=" + customerTelephoneNumber + "]";
	}

}
