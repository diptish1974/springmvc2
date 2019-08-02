package com.cgi.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cgi.model.Employee;

public class EmployeeRepository {

	private Connection connection;
	private PreparedStatement statement;
	
	public EmployeeRepository() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeDB","root","cgi123");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}	
	public boolean addEmployee(Employee employee)
	{
		String sql="INSERT INTO emp_master VALUES(?,?)";
		try {
			statement=connection.prepareStatement(sql);
			statement.setString(1,employee.getCode());
			statement.setString(2,employee.getName());
			int status=statement.executeUpdate();
			if(status>0)
			{
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	public boolean delete(String code)
	{
		String sql="DELETE FROM emp_master WHERE code=?";
		try {
			statement=connection.prepareStatement(sql);
			statement.setString(1,code);
			int status=statement.executeUpdate();
			if(status>0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
				
	}
	
	public List<Employee> getEmployees()
	{
		List<Employee> empList=new ArrayList<Employee>();
		String sql="SELECT code,name FROM emp_master";
		try {
			statement=connection.prepareStatement(sql);
			ResultSet result=statement.executeQuery();
			while(result.next())
			{
				Employee emp=new Employee();
				emp.setCode(result.getString("code"));
				emp.setName(result.getString("name"));
				empList.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return empList;
	}
	
	
	
	}
	
	

