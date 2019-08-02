package com.cgi.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=null;
	try
	{
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeDB","root","cgi123");
    System.out.println("Connected");
    //The below statement holds the SQL statement
    Statement statement=connection.createStatement();
    //n is basically the number of records updated 
    int n=statement.executeUpdate("INSERT INTO emp_master VALUES('E0004','Suresh')");
    if(n>0)
    {
    	System.out.println("Record inserted with success!!!");
    }
    
	}finally
	{
		connection.close();
	}
	
	
	}

}
