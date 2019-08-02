package com.cgi.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner scanner=new Scanner(System.in);
	String code;
	String name;
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=null;
	try
	{
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeDB","root","cgi123");
    Statement statement=connection.createStatement();
    System.out.println("Enter the code to be deleted");
    code=scanner.next();
   
    String sql="DELETE FROM emp_master WHERE code='"+code+"'";
    System.out.println(sql);
    int n=statement.executeUpdate(sql);
    if(n>0)
    {
    	System.out.println("Record deleted with success!!!");
    }
    
	}finally
	{
		connection.close();
	}
	
	
	}

}
