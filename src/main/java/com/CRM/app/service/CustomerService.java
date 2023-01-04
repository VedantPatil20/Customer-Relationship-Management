package com.CRM.app.service;

import java.util.List;

import com.CRM.app.model.Customer;

public interface CustomerService {
	
	List <Customer> getAllCustomers();
	
	Customer saveCustomer(Customer customer);
	
	Customer getCustomerById(Long id);

}
