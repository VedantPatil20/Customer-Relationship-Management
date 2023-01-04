package com.CRM.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.CRM.app.model.Customer;
import com.CRM.app.service.CustomerService;

@Controller
public class CustomerAddingController {
	
	@Autowired
	private CustomerService customerSevice;

	@GetMapping("/customers")
	public String showCustomers(Model model) {
		model.addAttribute("listOfCustomer", customerSevice.getAllCustomers());
		return "Customer";
	}
	
	@GetMapping("/customers/new")
	public String createCustomerForm(Model model) {
		
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "addcustomer";
		
	}
	
	@PostMapping("/customers")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		
		customerSevice.saveCustomer(customer);
		return "redirect:/customers";

	}

}
