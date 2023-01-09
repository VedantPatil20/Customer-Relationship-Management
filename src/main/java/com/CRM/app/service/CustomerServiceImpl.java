package com.CRM.app.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.CRM.app.model.Customer;
import com.CRM.app.repository.CustomerRepository;

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
	public Customer saveCustomer(Customer customer) {
		
		return customerRepository.save(customer);
		
	}

	@Override
	public Customer getCustomerById(Long id) {
		
		return customerRepository.findById(id).get();
		
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		return customerRepository.save(customer);
		
	}

	@Override
	public void deleteCustomerById(Long id) {
		
		customerRepository.deleteById(id);
		
	}

}
