package com.CRM.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.CRM.app.model.Customer;
import com.CRM.app.repository.CustomerRepository;
import com.CRM.app.web.dto.CustomerAddingDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}
	
	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer save(CustomerAddingDto customerAddingDto) {
		
		Customer customer = new Customer(customerAddingDto.getFirstName(), 
										 customerAddingDto.getLastName(), 
										 customerAddingDto.getEmail(), 
										 customerAddingDto.getContact());
		
		return customerRepository.save(customer);
		
	}

	@Override
	public Customer getCustomerById(Long id) {
		
		Optional <Customer> optional = customerRepository.findById(id);
		
		Customer customer = null;
		
		if (optional.isPresent()) {
			customer = optional.get();
		} else {
			throw new RuntimeException("Customer not found for id:: " + id);
		}
		
		return customer;
		
	}
	
	
	
	

}
