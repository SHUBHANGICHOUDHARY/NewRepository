package com.example.domain;

public class Employee 
{
	//instance variable,class variable,variable declaration
	//why variables are required
	//why datatypes are required
	//what is the value stored in each datatype
	//what are access specifiers and types
	//encapsulation data hiding private
	
	private int employeeId;
	private String employeeName;
	private String employeeSSN;
	private double employeesalary;
	
	public Employee()
	{
		super();
		
	}
	public Employee(int employeeId, String employeeName, String employeeSSN, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSSN = employeeSSN;
		this.employeesalary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeSSN() {
		return employeeSSN;
	}
	
	public double getSalary() {
		return employeesalary;
	}
	public double raiseSalary(double increase)
	{
		return employeesalary=employeesalary+increase;
	}
	
}
