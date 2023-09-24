package com.finzly.BBCUserSide.service;

import java.util.List;

//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.Reader;
//import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.BBCUserSide.dao.CustomerInvoiceDao;
import com.finzly.BBCUserSide.dao.PaymentDao;
import com.finzly.BBCUserSide.entity.CardDetails;
import com.finzly.BBCUserSide.entity.CustomerInvoice;
import com.finzly.BBCUserSide.entity.Payment;
import com.finzly.BBCUserSide.utility.ValidCardDetails;

@Service
public class CustomerInvoiceService {

	@Autowired
	private CustomerInvoiceDao customerInvoiceDao;
	
	@Autowired
	private PaymentDao paymentDao;
	
	@Autowired
	private ValidCardDetails validCard;

	private static final double DISCOUNT = 0.05;
	
	
	public List<CustomerInvoice> getCustomerInvoiceByCustomerId(long id){
		return customerInvoiceDao.getCustomerInvoiceByCustomerId(id);
	}

	public CustomerInvoice getCustomerInvoiceById(long id) {
		return customerInvoiceDao.getCustomerInvoiceById(id);
	}

	public String updateCustomerData(long id, String paymentMethod, CardDetails cardDetails) {
		CustomerInvoice customerInvoice = customerInvoiceDao.getCustomerInvoiceById(id);
		
		if(paymentMethod.equalsIgnoreCase("credit/debit"))
		{
			String value = validCard.validCardDetails(cardDetails);
			
			if(value.equals("valid"))
			{
				customerInvoice.setPrice(customerInvoice.getPrice()*DISCOUNT);
				customerInvoice.setPaymentMethod(paymentMethod);
				customerInvoice.setPaymentStatus("paid");
				String response = customerInvoiceDao.updateCustomerData(customerInvoice);
				
				//LOGGER
				
				Payment payment = new Payment();
				payment.setCustomerId(id);
				payment.setCustomerInvoiceId(customerInvoice.getCustomerInvoiceId());
				payment.setPrice(customerInvoice.getPrice());
				payment.setPaymentDate(java.time.LocalDate.now());
				
				return paymentDao.addPayment(payment);
			}
			else
			{
				return value;
			}
		}
		else if(paymentMethod.equalsIgnoreCase("wallet"))
		{
			customerInvoice.setPrice(customerInvoice.getPrice()*DISCOUNT);
			customerInvoice.setPaymentMethod(paymentMethod);
			customerInvoice.setPaymentStatus("paid");
			String response = customerInvoiceDao.updateCustomerData(customerInvoice);
			
			//LOGGER
			
			Payment payment = new Payment();
			payment.setCustomerId(id);
			payment.setCustomerInvoiceId(customerInvoice.getCustomerInvoiceId());
			payment.setPrice(customerInvoice.getPrice());
			payment.setPaymentDate(java.time.LocalDate.now());
			
			return paymentDao.addPayment(payment);
		}
		return "Invalid Method";
	}

	
}
