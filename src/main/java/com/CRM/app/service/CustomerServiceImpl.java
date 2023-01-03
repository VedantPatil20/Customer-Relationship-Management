package com.CRM.app.service;

import org.springframework.stereotype.Service;

import com.CRM.app.model.Customer;
import com.CRM.app.repository.CustomerRepository;
import com.CRM.app.web.dto.CustomerAddingDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	@Override
	public Customer save(CustomerAddingDto customerAddingDto) {
		
		Customer customer = new Customer(customerAddingDto.getFirstName(), 
										 customerAddingDto.getLastName(), 
										 customerAddingDto.getEmail(), 
										 customerAddingDto.getContact());
		
		return customerRepository.save(customer);
		
	}
	
	
	
	

}
