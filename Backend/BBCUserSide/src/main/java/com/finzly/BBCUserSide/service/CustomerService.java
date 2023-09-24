package com.finzly.BBCUserSide.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.BBCUserSide.dao.CustomerDao;
import com.finzly.BBCUserSide.entity.Customer;


@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public Customer getCustomerByCusomterId(long id) {
		return customerDao.getCustomerByCusomterId(id);
	}
	
	
	

}
