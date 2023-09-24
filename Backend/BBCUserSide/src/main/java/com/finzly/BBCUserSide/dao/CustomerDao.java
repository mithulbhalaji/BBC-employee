package com.finzly.BBCUserSide.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.BBCUserSide.entity.Customer;

@Repository
public class CustomerDao {


	@Autowired
	private SessionFactory sessionFactory;	

	public Customer getCustomerByCusomterId(long id) {
		Session session = sessionFactory.openSession();
		Customer customer = session.get(Customer.class, id);
		return customer;
	}
	

}
