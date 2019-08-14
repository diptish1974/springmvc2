package com.cgi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cgi.model.Customer;
import com.cgi.service.CustomerService;

@Controller

public class CustomerController {

	@Autowired
	CustomerService service;
	 
	 @GetMapping("/customeradd")
	 public String addCustomer(HttpSession session, @ModelAttribute Customer customer)
	 {
		 String view;
		    String username=(String)session.getAttribute("username");
		    System.out.println("The value is "+username);
	        if(username!=null)
	        {
	        	service.customerAdd(customer);
	        	view="customersuccess";
	        }
	        else
	        {
	        	view="login";
	        }
	        
	        return view;
	 }
	
}
