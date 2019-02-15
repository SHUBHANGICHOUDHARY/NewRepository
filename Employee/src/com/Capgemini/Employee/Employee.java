package com.Capgemini.Employee;

public class Employee
{
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId()
	{
		return empId;
	}
	
	public String getEmpName()
	{
		return empName;
	}

	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}

	public double getEmpSalary() 
	{
		return empSalary;
	}

	public void showEmployeeDetails(int id)
	{
		if(empId==id)
		{
			System.out.println("---------------------------------------");
			System.out.println("Employee Id : "+empId);
			System.out.println("Employee Name : "+empName);
			System.out.println("Employee Salary : "+empSalary);
			System.out.println("---------------------------------------");
		}
		else
		{
			System.out.println("No Records Found");
		}
	}
	
	public void showEmployeesDetail()
	{
		System.out.println("---------------------------------------");
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Salary : "+empSalary);
		System.out.println("---------------------------------------");
	}
	
	public void addNewEmployee(Employee e)
	{
		
	}
	
	public void removeEmployee(Employee e)
	{
		
	}

	public void updateEmployeeDetail()
	{
		
	}

}
