package com.cgi.controller;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cgi.model.User;
import com.cgi.service.UserService;

@Controller
public class UserAuthenticationController {

	@Autowired
	private UserService service;
	

	@GetMapping("/")
	public String login()
	{
		return "login";
	}
	
	
	@PostMapping("/validate")
	public String validate(HttpSession session,@ModelAttribute User user)
	{
		
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
				  String view="error";
		         boolean found=service.validateUser(user.getUserName(),user.getPassword());
		         
		         if(found)
		         {
		              session.setAttribute("username",user.getUserName());	  
		        	  view="customerform";
		         }
		         return view;
	}
	
}
