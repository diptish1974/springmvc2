package com.cgi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
  
	    @RequestMapping("/show")
	    public String myMethod(Model m)
	    {
	    	m.addAttribute("data","Hello World");
	    	return "disp";
	    }
}
