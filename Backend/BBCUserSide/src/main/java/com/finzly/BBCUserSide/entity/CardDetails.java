package com.finzly.BBCUserSide.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CardDetails 
{

	@Id
	private long cardNumber;
	private long CVVNumber;
	private LocalDate expiryDate;
	private double balance;
	
	public CardDetails() {
		
	}
	public CardDetails(long cardNumber, long cVVNumber, LocalDate expiryDate, double balance) {
		super();
		this.cardNumber = cardNumber;
		CVVNumber = cVVNumber;
		this.expiryDate = expiryDate;
		this.balance = balance;
	}
	
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public long getCVVNumber() {
		return CVVNumber;
	}
	public void setCVVNumber(long cVVNumber) {
		CVVNumber = cVVNumber;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	@Override
	public String toString() {
		return "CardDetails [cardNumber=" + cardNumber + ", CVVNumber=" + CVVNumber + ", expiryDate=" + expiryDate
				+ ", balance=" + balance + "]";
	}
	
	
}
