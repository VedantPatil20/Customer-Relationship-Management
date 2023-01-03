package com.CRM.app.service;

import com.CRM.app.model.Customer;
import com.CRM.app.web.dto.CustomerAddingDto;

public interface CustomerService {
	
	Customer save(CustomerAddingDto customerAddingDto);

}
