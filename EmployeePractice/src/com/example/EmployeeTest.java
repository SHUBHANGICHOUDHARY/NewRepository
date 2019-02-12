package com.example;

import java.text.NumberFormat;
import java.util.Locale;

import com.example.domain.Admin;

import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;


public class EmployeeTest 
{
	
	public static void printEmployee(Employee e1)
	{
		System.out.println("_____________________");
		System.out.println("Employee ID "+e1.getEmployeeId());
		System.out.println("Employee Name "+e1.getEmployeeName());
		System.out.println("Employee SSN "+e1.getEmployeeSSN());
		System.out.println("Employee Salary "+e1.getSalary());
		System.out.println("_____________________");
	}

	public static void main(String args[])
	{	
		
		Engineer e1=new Engineer(101,"Jane Smith","012-34-5678",120345.27);
		Manager m1=new Manager(207,"Barbara Johnson","054-12-2367",109501.36,"Marketing");
		m1.raiseSalary(1000);
		m1.setEmployeeName("Rohit");
		EmployeeTest.printEmployee(m1);
		
		Admin a1=new Admin(304,"Bill Monroe","108-23-6509",75002.84);
		a1.raiseSalary(2000);
		EmployeeTest.printEmployee(a1);
		
		Director d1=new Director(12,"Susan Wheeler","099-45-2340",120567.36,"Gobal Marketing",1000000);
		d1.raiseSalary(3000);
		
		EmployeeTest.printEmployee(d1);
		
		EmployeeTest.printEmployee(e1);
		
		
		
	}
	
}
