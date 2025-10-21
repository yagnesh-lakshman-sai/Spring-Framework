package com;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Test {
	
	
	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate template = container.getBean("template",JdbcTemplate.class);
		
//		template.update("Insert into employees values(?,?,?)",20,"twenty@gmail.com",10909);
		
//		template.update("Update employees set email= ? where empId = ?" , "updated@gmail.com" ,20);
		
//		template.update("Delete from employees where empId = ?",20);
	
		// RowMapper
		
//		Employee employee = template.queryForObject("select * from employees where empId=?", new RowMapper<Employee>() {
//			
//			@Override
//			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//				return new Employee(rs.getInt(1) , rs.getString(2) , rs.getDouble(3) );
//			}
//		
//		} , 5);
//		
//		System.out.println(employee);
//		
//		List<Employee> employeesList = template.query("select * from employees", new RowMapper<Employee>() {
//			
//			@Override
//			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//				return new Employee(rs.getInt(1) , rs.getString(2) , rs.getDouble(3) );
//			}
//		
//		});
//		System.out.println(employeesList);
//		
		List<Employee> employeesList2 = template.query("select * from employees", (rs,num) ->  new Employee(rs.getInt(1) , rs.getString(2) , rs.getDouble(3)) );
		System.out.println(employeesList2);
	}

}
