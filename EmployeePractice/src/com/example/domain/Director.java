package com.example.domain;

public class Director extends Manager
{
	private double budget;
	
	public Director(int employeeId, String employeeName, String employeeSSN, double salary, String deptName,double budget) {
		super(employeeId, employeeName, employeeSSN, salary, deptName);
	this.budget=budget;
	}
	public double getBudget() {
		return budget;
	}
	

	
	

}
