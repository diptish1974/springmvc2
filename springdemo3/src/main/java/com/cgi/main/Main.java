package com.cgi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.model.Address;
import com.cgi.model.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	    Employee employee=(Employee)context.getBean("employee");
	    System.out.println(employee.getId());
	    System.out.println(employee.getName());
	    System.out.println(employee.getDesig());
	    //System.out.println(employee.getAddress());
	    Address ad=employee.getAddress();
	    System.out.println(ad.getHno());
	    System.out.println(ad.getCity());
	    
	}

}
