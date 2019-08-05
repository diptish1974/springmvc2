package com.cgi.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
   //Loading the MySQL driver		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection connection=null;
	try
	{
	//Obtaining the connection object
    // 1) URL  protocol:subprotcol://machine_name/ipaddress:port_number/databasename
    // 2) Username
	// 3) Password
		
		
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeDB","root","cgi123");
    System.out.println("Connected");
    //The below statement holds the SQL statement
    Statement statement=connection.createStatement();
    //executeQuery returns ResultSet
    //ResultSet is an interface
    ResultSet result=statement.executeQuery("SELECT code,name from emp_master");
    
    while(result.next())
    {
    	System.out.println(result.getString("code")+"\t"+result.getString("name"));
    }
	}finally
	{
		connection.close();
	}
	
	
	}

}
