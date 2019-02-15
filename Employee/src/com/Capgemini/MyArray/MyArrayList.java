package com.Capgemini.MyArray;

import com.Capgemini.Employee.Employee;

public class MyArrayList 
{
	private Employee[] empList;
	private int top=-1;
	private int size;
	
	public MyArrayList(int n) 
	{
		size=n;
		empList=new Employee[n];
	}
	
	public boolean addNewEmployee(Employee e) 
	{
		if(!isFull()) 
		{
			top++;
			empList[top]=e;
			return true;
		}
		else
			return false;
		}
	public int removeEmployee(int empId) 
	{
		int index=-1;
		int temp=-1;
		if(!isEmpty()) {
			for(int i=0;i<=top;i++) 
			{
				if(empList[i].getEmpId()==empId)
					index=i;
			}
			if(index!=-1) 
			{
				for(int i=index;i<top;i++) 
				{
					empList[i]=empList[i+1];
						
				}
				temp=1;
				top--;
				
			}
			else
			   temp=0;
		}
		return temp;
	}
	
	public boolean isFull() 
	{
		if(top==size-1)
			return true;
		else
			return false;	
	}
	
	public boolean isEmpty() 
	{
		if(top==-1)
			return true;
		else 
			return false;
	}
	
	public void showAllEmployeeDetails() 
	{
		for(int i=0;i<=top;i++) {
			System.out.println(empList[i].getEmpId()+"  "+empList[i].getEmpName()+"  "+empList[i].getEmpSalary());
			
		}
	}
	
	public void getEmployeeDetails(int empId)
	{
		for(int i=0;i<=top;i++) {
			if(empList[i].getEmpId()==empId)
			System.out.println(empList[i].getEmpId()+"  "+empList[i].getEmpName()+"  "+empList[i].getEmpSalary());
			
		}
	}
}
