class BankAccount
{

	private int accountNumber;
	private String holderName;
	private String holderAddress;
	private String openDate;
	private double balance;
	private double[] transactions;
	private String[] transactionsSummary;
	private double[] transactionAmount;
	private int numOfTransactions;
	
	public BankAccount(String abc, double xyz, String address, String open)
	{
		holderName = abc;
		balance = xyz;
		holderAddress = address;
		openDate = open;
		transactions = new double[100];
		transactionsSummary = new String[100];
		numOfTransactions = 0;
		transactionAmount = new double[100];
	}	

	public String getAccountInfo()
	{
		return "Account number: " + accountNumber + "\nCustomer Name: " + holderName + "\nHolder's Address: " + holderAddress + "\nOpen Date: " + openDate +  "\nBalance:" + balance +"\n";
	}	
	
	public String getTransactionInfo(int n)
	{
		int transactionNum=n;
		String transaction = transactionsSummary[n];
		if (transaction == null) 
		{
			System.out.println("No transaction exists");
			return "No transaction exists with that number.";
		}	
		else 
		{
			System.out.println("Transaction Number = "+transactionNum+" Transaction Type = " +transaction);
			return transaction;
		}
	}

	public int getAccountNum()
	{
		System.out.println(accountNumber);
		return accountNumber;
	}

	public int getNumberOfTransactions() 
	{
		System.out.println(numOfTransactions);
		return numOfTransactions;
	}

	public void deposit(double amount)
	{

		if (amount<=0) 
		{
			System.out.println("Amount to be deposited should be more than 0");
		}
		else 
		{
			balance = balance + amount;
			numOfTransactions++;
			transactionsSummary[numOfTransactions] = "Deposit";
			transactionAmount[numOfTransactions]=amount;
			System.out.println("Balance  =  "+balance+ "  Number of Transaction  =  "+ numOfTransactions+"  Transaction Summary  =  "+transactionsSummary[numOfTransactions]+" Amount Added = "+amount);
		}	
	}

	public void withdraw(double amount)
	{
		if (amount<=0)
		{
			System.out.println("Amount to be withdrawn should be more than 0");
		}	
		else
		{
			if (balance < amount) 
			{
				System.out.println("Insufficient balance");
			}
			else 
			{
				balance = balance - amount;
				numOfTransactions++;
				transactionsSummary[numOfTransactions] = "Withdrawn";
				transactionAmount[numOfTransactions]=amount;
				System.out.println("Balance  =  "+balance+ "  Number of Transaction  =  "+ numOfTransactions+"  Transaction Summary  =  "+transactionsSummary[numOfTransactions]+" Amount Withdrawn = "+amount);
			}	
		}
	}
	public void miniStatement()
	{
		System.out.println("Transaction Type 	Transaction Amount");
		for(int i=numOfTransactions;i>=numOfTransactions-10;i--)
		{
			System.out.println(transactionsSummary[i]+"              "+transactionAmount[i]);
		}
	}
}



