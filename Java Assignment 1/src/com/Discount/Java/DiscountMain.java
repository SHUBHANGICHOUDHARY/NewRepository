package com.Discount.Java;

import java.sql.Date;

public class DiscountMain
{

	
	public static void main(String[] args) {
		Customer c1 = new Customer("Shubhangi", true, "Silver");
        
        System.out.println("Hello " +c1.getName());
        System.out.println("Welcome to Beauty Parlor");
        System.out.println("The Membership you are taking is" +c1.getMemberType());
        
        Visit v1 = new Visit(c1, new Date(10, 01, 2019));
       
        v1.setProductExpense(45);
        v1.setServiceExpense(85);
        
        
		System.out.println("Total expense made  = " + v1.getTotalExpense());
        System.out.println(" You have entered on " +v1.getDate());
	}

}
