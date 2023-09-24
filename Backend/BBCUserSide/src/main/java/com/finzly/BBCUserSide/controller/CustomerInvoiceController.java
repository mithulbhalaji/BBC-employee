package com.finzly.BBCUserSide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.finzly.BBCUserSide.entity.CardDetails;
import com.finzly.BBCUserSide.entity.CustomerInvoice;
import com.finzly.BBCUserSide.service.CustomerInvoiceService;

@RestController
@RequestMapping("customerinvoice")
public class CustomerInvoiceController {

	@Autowired
	private CustomerInvoiceService customerInvoiceService;
	
	@GetMapping("getcustomerinvoicebycustomerid/{id}")
	public List<CustomerInvoice> getCustomerInvoiceByCustomerId(@PathVariable long id) {
		return customerInvoiceService.getCustomerInvoiceByCustomerId(id);
	}

	@GetMapping("getcustomerinvoicebyid/{id}")
	public CustomerInvoice getCustomerInvoiceById(@PathVariable long id) {
		return customerInvoiceService.getCustomerInvoiceById(id);
	}

	@PutMapping("updatecustomerdata/{id}/{paymentmethod}")
	private String updateCustomerData(@PathVariable long id,@PathVariable String paymentMethod, @RequestBody CardDetails cardDetails) {
		return customerInvoiceService.updateCustomerData(id,paymentMethod,cardDetails);
	}

}
