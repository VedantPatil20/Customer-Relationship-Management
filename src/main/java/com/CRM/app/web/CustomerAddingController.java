package com.CRM.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.CRM.app.service.CustomerSevice;
import com.CRM.app.web.dto.CustomerAddingDto;

@Controller
@RequestMapping("/addcustomers")
public class CustomerAddingController {
	
	private CustomerSevice customerSevice;

	public CustomerAddingController(CustomerSevice customerSevice) {
		super();
		this.customerSevice = customerSevice;
	}
	
	public String addCutomers(@ModelAttribute("customer") CustomerAddingDto customerAddingDto) {
		
		customerSevice.save(customerAddingDto);
		return "redirect:/addcustomer?success";
		
	}

}
