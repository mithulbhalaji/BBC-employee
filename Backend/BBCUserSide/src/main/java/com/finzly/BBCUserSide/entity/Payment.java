package com.finzly.BBCUserSide.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long paymentId;
	private long customerInvoiceId;
	private long customerId;
	private LocalDate paymentDate;
	private double price;
	
	public Payment() {
		super();
	}

	public Payment(long customerInvoiceId, long customerId, LocalDate paymentDate, double price) {
		super();
		this.customerInvoiceId = customerInvoiceId;
		this.customerId = customerId;
		this.paymentDate = paymentDate;
		this.price = price;
	}

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public long getCustomerInvoiceId() {
		return customerInvoiceId;
	}

	public void setCustomerInvoiceId(long customerInvoiceId) {
		this.customerInvoiceId = customerInvoiceId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
