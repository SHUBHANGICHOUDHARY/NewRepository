package com.Capgemini.Savings;

import java.util.Iterator;
import java.util.TreeSet;

public class TestBankAccountSet {

	public static void main(String args[])
	{
		SavingsAccount s1=new SavingsAccount(50000,108,"Shubhangi",true);
		SavingsAccount s2=new SavingsAccount(20000,103,"Seshu",false);
		SavingsAccount s3=new SavingsAccount(60000,101,"Simmy",true);
		SavingsAccount s4=new SavingsAccount(70000,106,"Mouni",true);
		BankAccountSet ba=new BankAccountSet();
		ba.addBankAccount(s1);
		ba.addBankAccount(s2);
		ba.addBankAccount(s3);
		ba.addBankAccount(s4);
		for (SavingsAccount s: ba.getAllAccounts())
		{
			 System.out.println(s);
		}	
	}
}
