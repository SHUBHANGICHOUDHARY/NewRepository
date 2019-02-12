package com.Account.Java;
public class AccountMain 
{

	public static void main(String args[])
	{
		Account a1=new Account( "100","Shubhangi",0);
		
		Account a2=new Account( "101","Mounika",0);
		a1.getId();
		a1.getName();
		a1.getBalance();
		a1.creditAmount("100",50000);
		a1.debitAmount(10000);
		a1.transferAmount("101", 30000);
		System.out.println(a1.toString());
		
		
	}
}