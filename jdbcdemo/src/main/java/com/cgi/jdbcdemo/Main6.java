package com.cgi.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner scanner=new Scanner(System.in);
	String code;
	String name;
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=null;
	try
	{
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeDB","root","cgi123");
	System.out.println("Enter the code to be deleted");
    code=scanner.next();
   
	String sql="DELETE FROM emp_master WHERE code=?";
	PreparedStatement statement=connection.prepareStatement(sql);
    statement.setString(1,code);
	System.out.println(sql);
    int n=statement.executeUpdate();
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
