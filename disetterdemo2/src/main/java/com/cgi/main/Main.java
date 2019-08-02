package com.cgi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.model.Address;
import com.cgi.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("model.xml");
        Employee emp=(Employee)con.getBean("employee");
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        Address ad=emp.getAddress();
        System.out.println(ad.getHno());
        System.out.println(ad.getStreet());
        System.out.println(ad.getCity());
 
	}

}
