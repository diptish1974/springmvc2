package com.cgi.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main2 {
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
    System.out.println("Enter the code");
    code=scanner.next();
    System.out.println("Enter the name");
    name=scanner.next();
    String sql="INSERT INTO emp_master VALUES('"+code+"','"+name+"')";
    System.out.println(sql);
    int n=statement.executeUpdate(sql);
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
