package com.employee.service;

import java.util.List;

import com.employee.pojo.Employee;

public interface EmployeeService
{
	public boolean addEmp(Employee e);
	public boolean deleteEmp(Employee e);
	public List<Employee> getEmp(Employee e);
	public boolean updateEmpSal(Employee e);	
	public String getMaxSalary();
	public boolean getWithComm();
}
