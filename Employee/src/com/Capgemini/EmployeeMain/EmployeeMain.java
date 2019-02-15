package com.Capgemini.EmployeeMain;

import java.util.Scanner;

import com.Capgemini.Employee.Employee;

public class EmployeeMain 
{
	public static void main(String args[]) 
	{
		
		Employee[] empList =new Employee[10];
		Scanner sc=new Scanner(System.in);
		int choice;
		do 
		{
			System.out.println("1.Add new employee");
			System.out.println("2.Remove a Employee");
			System.out.println("3.Update employee details");
			System.out.println("4.Show Details of employee");
			System.out.println("5.Show detail of employees");
			System.out.println("6.Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter Details of employee");
					for(int i=0;i>=empList.length;i++)
					{
						empList[i].addNewEmployee(empList[i]);
					}
					break;
				/*case 2:
					System.out.println("Withdraw");
					empList.removeEmployee();
					break;
				case 3:
					System.out.println("Mini Statement");
					empList.updateEmployeeDettails();
					break;
				case 4:
					System.out.println("Deposite");
					empList.showEmployeeDetails();
					break;
				case 5:
					System.out.println("Withdraw");
					empList.showEmployeesDetail();
					break;*/
			}
		}while(choice!=6);
	}
}
