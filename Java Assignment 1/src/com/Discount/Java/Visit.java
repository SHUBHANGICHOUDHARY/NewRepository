package com.Discount.Java;
import java.sql.Date;

public class Visit 
{
	
	Customer name;
	double serviceExpense; 
	double productExpense; 
	Date date;
	Visit(Customer name,Date date) 
	{
		this.name=name;
		this.date=date;
	}
	public double getServiceExpense() 
	{
		System.out.println("ServiceExpense = "+serviceExpense);
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) 
	{
		System.out.println("SetServiceExpense = "+serviceExpense);
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpense() 
	{
		System.out.println("ProductExpense = "+productExpense);
		return productExpense;
	}

	public void setProductExpense(double productExpense) 
	{
		System.out.println("SetProductExpense = "+productExpense);
		this.productExpense = productExpense;
	}

	public double getTotalExpense() 
	{
		double totalExpense = serviceExpense + productExpense;
		System.out.println("Welcome to "+name);
		System.out.println("Total Expenses= "+totalExpense);
		return totalExpense;
	}
	public Date getDate() {
		return date;
	}
}
