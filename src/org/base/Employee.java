package org.base;

import org.sample.Client;

public class Employee extends Client{
	public void empId() {
		System.out.println("employee id is");

	}public void empName() {
		System.out.println("employee name is");

	}public static void main(String[] args) {
		Employee e =new Employee();
		
		e.empId();
		e.empName();
		e.clientId();
		e.clientName();
		
	}

}
