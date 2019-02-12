package com.Discount.Java;
import java.sql.Date;

public class Discount extends Visit
{
	
		Discount(String name, String date) 
		{
			super(name, date);
		}
		double serviceDiscountPremium=0.2;
		double serviceDiscountGold=0.15;
		double serviceDiscountSilver=0.1;
		double productDiscountPremium=0.1;
		double productDiscountGold=0.1;
		double productDiscountSilver=0.1;
		double discount;
		
		public double serviceDiscountRate(String type)
		{
			if (memberType == "Premium")
			{
				discount=  serviceExpense - (serviceExpense*serviceDiscountPremium);
				System.out.println("Welcome " +name);
				System.out.println("You are Premium member now...");
				System.out.println("You have a discount of  "+discount);
			}
			
			else if (memberType == "Gold")
			{
				discount=  serviceExpense - (serviceExpense*serviceDiscountGold);
				System.out.println("Welcome " +name);
				System.out.println("You are Gold member now...");
				System.out.println("You have a discount of  "+discount);
			}
			
			else if (memberType == "Silver")
			{
				discount=  serviceExpense - (serviceExpense*serviceDiscountSilver);
				System.out.println("Welcome " +name);
				System.out.println("You are Silver member now...");
				System.out.println("You have a discount of  "+discount);
			}
			else 
			{
				System.out.println("Sorry..... You are not Authorized to this");
			}
			return discount;
		}
		public double productDiscountRate(String type)
		{
			if (memberType == "Premium")
			{
				discount=  productExpense - (productExpense*productDiscountPremium);
				System.out.println("Welcome " +name);
				System.out.println("You are Premium member now...");
				System.out.println("You have a discount of  "+discount);
			}
			
			else if (memberType == "Gold")
			{
				discount=  productExpense - (productExpense*productDiscountGold);
				System.out.println("Welcome " +name);
				System.out.println("You are Gold member now...");
				System.out.println("You have a discount of  "+discount);
			}
			
			else
			{
				discount=  productExpense - (productExpense*productDiscountSilver);
				System.out.println("Welcome " +name);
				System.out.println("You are Silver member now...");
				System.out.println("You have a discount of  "+discount);
			}
			return discount;
		}	
}

