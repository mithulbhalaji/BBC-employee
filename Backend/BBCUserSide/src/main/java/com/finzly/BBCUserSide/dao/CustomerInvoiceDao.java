package com.finzly.BBCUserSide.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.BBCUserSide.entity.CustomerInvoice;

@Repository
public class CustomerInvoiceDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	public List<CustomerInvoice> getCustomerInvoiceByCustomerId(long id) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(CustomerInvoice.class);
		criteria.createAlias("customer", "c");
		criteria.add(Restrictions.eq("c.customer_id", id));
		return criteria.list();
	}

	public CustomerInvoice getCustomerInvoiceById(long id) {
		Session session = sessionFactory.openSession();
		CustomerInvoice customerInvoice = session.get(CustomerInvoice.class, id);
		return customerInvoice;
	}

	public String updateCustomerData(CustomerInvoice customerInvoice) {
		Session session = sessionFactory.openSession();
		session.update(customerInvoice);
		return "Transaction updated successfully";
	}
	
}
