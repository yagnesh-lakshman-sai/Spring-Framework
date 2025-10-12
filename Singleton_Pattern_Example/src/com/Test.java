package com;

public class Test {
     
	public static void main(String[] args) {
		
		Employee employee = Employee.getEmployee();
		Employee employee2 = Employee.getEmployee();
		
		System.out.println(employee == employee2);
	}
}
