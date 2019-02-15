package com.Capgemini.Savings;

import java.util.Iterator;
import java.util.TreeSet;

public class BankAccountSet 
{
	TreeSet<SavingsAccount> t;

	public BankAccountSet() 
	{
		t=new TreeSet<>();
	}

	public void addBankAccount(SavingsAccount s)
	{
		t.add(s);
	}
	
	public TreeSet<SavingsAccount>getAllAccounts()
	{
		return t;
	}
	
}
