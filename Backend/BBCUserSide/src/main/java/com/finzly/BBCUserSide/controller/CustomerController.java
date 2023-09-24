package com.finzly.BBCUserSide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.BBCUserSide.entity.Customer;
import com.finzly.BBCUserSide.service.CustomerService;

@RestController
@RequestMapping("user")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("getcustomerbycustomerid/{id}")
	public Customer getCustomerByCusomterId(@PathVariable long id) {
		return customerService.getCustomerByCusomterId(id);
	}
}
