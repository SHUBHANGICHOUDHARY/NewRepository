package com.Account.Java;

public class Account 
{
	String id;
	String name;
	float balance;
	float amount;
	
	
	Account(String id,String name,float balance)
	{
		
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	String getId()
	{
		System.out.println("Id is "+id);
		return id;
	}
	String getName()
	{
		System.out.println("Name is "+name);
		return name;
	}
	float getBalance()
	{
		System.out.println("Balance is "+balance);
		return balance;
	}
	float creditAmount( String id ,float amount) 
	{
		balance=balance+amount;
		System.out.println("Balance after credit "+balance);
		return balance;
	
	}
	void debitAmount(float withdrawamount) 
	{	
        if(balance >=withdrawamount )
        {
            balance = balance - withdrawamount;
            System.out.println("Please collect your money "+ withdrawamount);
            System.out.println("Balance after withdraw "+balance);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
        System.out.println("");
	}
	float transferAmount(String id,float transferamount)
	{
		if(balance>=transferamount)
		{
			balance = balance - transferamount;

            System.out.println("Amount get tranfer "+ transferamount);
            System.out.println("Balance after transfer "+balance);
            
            return balance;
		}
		else
        {
            System.out.println("Amount exceeded balance");
            return 0;
        }
       
	}
	public String toString()
	{
		return "Account [id=" + id +" , name="+ name +" , balance="+ balance +"]";
		
	}
}
	