package com.cgi.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cgi.model.Employee;

@Repository(value="emprepo")
public class EmployeeRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public boolean addEmployee(Employee employee) {
		boolean inserted=false;
		int rows=0;
		String sql="INSERT INTO emp_master VALUES (?,?)";
 		rows=jdbcTemplate.update(sql,employee.getCode(),employee.getName());
       if(rows>0)
       {
    	   inserted=true;
       }
    	   return inserted;
	}
	
	public boolean deleteEmployee(String code)
	{
		boolean deleted=false;
		int rows=0;
		String sql="DELETE FROM emp_master WHERE code=?";
		rows=jdbcTemplate.update(sql,code);
       if(rows>0)
       {
    	   deleted=true;
       }
	    return deleted;
	} 
	
	public List<Employee>  displayEmployees()
	{
		String sql="SELECT code,name FROM emp_master";
		List<Employee> empList=jdbcTemplate.query(sql,new EmployeeMapper());
		return empList;
	}
	
	
}
