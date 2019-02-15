package com.Capgemini.Savings;

public class SavingsAccount implements Comparable<SavingsAccount>
{
	private double acc_balance; 
	private int acc_ID;
	private String accountHoldername; 
	private boolean isSalaryAccount;
	
	public SavingsAccount(double acc_balance, int acc_ID, String accountHoldername, boolean isSalaryAccount) 
	{
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername;
		this.isSalaryAccount = isSalaryAccount;
	}

	public double getAcc_balance()
	{
		return acc_balance;
	}

	public void setAcc_balance(double acc_balance) 
	{
		this.acc_balance = acc_balance;
	}

	public int getAcc_ID() 
	{
		return acc_ID;
	}

	public void setAcc_ID(int acc_ID)
	{
		this.acc_ID = acc_ID;
	}

	public String getAccountHoldername() 
	{
		return accountHoldername;
	}

	public void setAccountHoldername(String accountHoldername) 
	{
		this.accountHoldername = accountHoldername;
	}

	public boolean getIsSalaryAccount() 
	{
		return isSalaryAccount;
	}

	public void setIsSalaryAccount(boolean isSalaryAccount) 
	{
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public double deposit(double amount)
	{
		acc_balance=acc_balance+amount;
		System.out.println("Balance : "+acc_balance);
		return acc_balance;
	}
	
	public double withdraw(double amount)
	{
		if(acc_balance>amount)
		{
			acc_balance=acc_balance-amount;
			System.out.println("Balance : "+acc_balance);
		}
		else 
		{
			System.out.println("Insufficient Balance");
		}
			return acc_balance;
	}
	
	
	@Override
	public String toString() {
		return "SavingsAccount [acc_balance=" + acc_balance + ", acc_ID=" + acc_ID + ", accountHoldername="
				+ accountHoldername + ", isSalaryAccount=" + isSalaryAccount + "]";
	}

	@Override
	public int compareTo(SavingsAccount s) 
	{
		return this.acc_ID-s.acc_ID;
	}
}