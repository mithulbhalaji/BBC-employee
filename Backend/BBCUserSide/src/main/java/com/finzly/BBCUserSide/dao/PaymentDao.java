package com.finzly.BBCUserSide.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.BBCUserSide.entity.Payment;

@Repository
public class PaymentDao
{
	@Autowired
	SessionFactory sf;
	
	
    public String addPayment(Payment payment)
    {
    	Session session = sf.openSession();
    	session.save(payment);
    	session.beginTransaction().commit();
    	return "Payment is successful";
    }
}
