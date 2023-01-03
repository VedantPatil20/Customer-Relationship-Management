package com.CRM.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.CRM.app.service.CustomerService;

@Controller
public class CustomerAddingController {
	
	@Autowired
	private CustomerService customerSevice;

	@GetMapping("/")
	public String showCustomers(Model model) {
		model.addAttribute("listOfCustomer", customerSevice.getAllCustomers());
		return "Customer";
	}
	
	

}
