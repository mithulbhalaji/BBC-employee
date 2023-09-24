package com.finzly.BBCUserSide.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CustomerInvoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerInvoiceId;
	
	private double customerUnitConsumption;
	private LocalDate startDate;
	private LocalDate dueDate;

	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;

	private String paymentMethod;
	private String paymentStatus;
	private double price;

	public CustomerInvoice() {
		super();
	}

	public CustomerInvoice(double customerUnitConsumption, LocalDate startDate, LocalDate dueDate, Customer customer,
			String paymentMethod, String paymentStatus, double price) {
		super();
		this.customerUnitConsumption = customerUnitConsumption;
		this.startDate = startDate;
		this.dueDate = dueDate;
		this.customer = customer;
		this.paymentMethod = paymentMethod;
		this.paymentStatus = paymentStatus;
		this.price = price;
	}
	
	
	public long getCustomerInvoiceId() {
		return customerInvoiceId;
	}

	public void setCustomerInvoiceId(long customerInvoiceId) {
		this.customerInvoiceId = customerInvoiceId;
	}

	public double getCustomerUnitConsumption() {
		return customerUnitConsumption;
	}

	public void setCustomerUnitConsumption(double customerUnitConsumption) {
		this.customerUnitConsumption = customerUnitConsumption;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CustomerInvoice [customerInvoiceId=" + customerInvoiceId + ", customerUnitConsumption="
				+ customerUnitConsumption + ", startDate=" + startDate + ", dueDate=" + dueDate + ", customer="
				+ customer + ", paymentMethod=" + paymentMethod + ", paymentStatus=" + paymentStatus + ", price="
				+ price + "]";
	}

	

}
