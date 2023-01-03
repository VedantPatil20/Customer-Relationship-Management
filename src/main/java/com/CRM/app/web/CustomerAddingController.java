package com.CRM.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.CRM.app.service.CustomerService;
import com.CRM.app.web.dto.CustomerAddingDto;

@Controller
@RequestMapping("/customer/save")
public class CustomerAddingController {
	
	private CustomerService customerSevice;

	public CustomerAddingController(CustomerService customerSevice) {
		super();
		this.customerSevice = customerSevice;
	}
	
	@ModelAttribute("customer")
	public CustomerAddingDto customerAddingDto() {
		return new CustomerAddingDto();
	}
	
	@GetMapping
	public String showAddingForm() {
		return "AddCustomer";
	}
	
	@PostMapping
	public String addCutomers(@ModelAttribute("customer") CustomerAddingDto customerAddingDto) {
		
		customerSevice.save(customerAddingDto);
		return "redirect://customer/save?success";
		
	}

}
