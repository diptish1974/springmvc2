package com.cgi.main;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cgi.model.Employee;
import com.cgi.repo.EmployeeRepo;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeRepo repo=(EmployeeRepo)context.getBean("emprepo");
	    Employee emp=(Employee)context.getBean("employee");
	    Scanner scanner=new Scanner(System.in);
	   int ch=0;
	   while(true)
	   {
	   System.out.println("1) ADD EMPLOYEE");
	   System.out.println("2) DELETE EMPLOYEEE");
	   System.out.println("3) UPDATE EMPLOYEE");
	   System.out.println("4) DISPLAY ALL EMPLOYEES");
	   System.out.println("4) EXIT");
	   System.out.println("Enter your choice");
	   ch=scanner.nextInt();
	   switch(ch)
	   {
	   case 1 :  System.out.println("Enter the code");
	       String code=scanner.next();
	    System.out.println("Enter the name");
	    String name=scanner.next();
	    emp.setCode(code);  
	    emp.setName(name);
	   boolean b=repo.addEmployee(emp);
	  if(b==true)
	  {
		System.out.println("Record added");  
	  }
	  else
	  {
		 System.out.println("Record not added"); 
	  }
      break;
	  
	   case 4 : List<Employee>  empList=repo.displayEmployees();
	             for(Employee e : empList)
	             {
	            	 System.out.println(e.getCode()+"\t"+e.getName());
	             }
	   
	   
	   
	   break;
	   
	   case 5 : System.exit(0);
	   
	   }
	   
	   }
	   
	   
	   }

}
