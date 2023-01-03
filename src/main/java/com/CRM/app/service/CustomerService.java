package com.CRM.app.service;

import java.util.List;

import com.CRM.app.model.Customer;
import com.CRM.app.web.dto.CustomerAddingDto;

public interface CustomerService {
	
	List <Customer> getAllCustomers();
	
	Customer save(CustomerAddingDto customerAddingDto);
	
	Customer getCustomerById(Long id);

}
