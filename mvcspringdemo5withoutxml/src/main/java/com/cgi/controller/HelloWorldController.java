package com.cgi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cgi.dao.StudentDAO;

import com.cgi.model.Student;

@Controller
@RequestMapping("/student")
public class HelloWorldController {

	@Autowired
	StudentDAO dao;
	
	 @RequestMapping("/")
	  public String hello()
	  {
		  return "index";
	  }
	 
	 @RequestMapping("/addStudent")
	 public String addStudent(@RequestParam String firstName,@RequestParam String lastName,@RequestParam String section)
	 {
		 Student student=new Student();
		 student.setFirstName(firstName);
		 student.setLastName(lastName);
		 student.setSection(section);
		 dao.saveStudent(student);
		 return "success";
	 }
}
