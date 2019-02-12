import java.util.Scanner;

public class BankMain 
{
	public static void main(String args[])
	{
		BankAccount b=new BankAccount("Shubh",10000.0,"igate","10/12/2018");
		int choice;
		int amount;
		Scanner sc=new Scanner(System.in);
		do 
		{
			System.out.println("1.Deposite");
			System.out.println("2.Withdrawn");
			System.out.println("3.MiniStatement");
			System.out.println("4.Get Transaction Information");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Deposite");
					System.out.println("Enter amount to be deposited : ");
					amount=sc.nextInt();
					b.deposit(amount);
					break;
				case 2:
					System.out.println("Withdraw");
					System.out.println("Enter amount to be withdrawn : ");
					amount=sc.nextInt();
					b.withdraw(amount);
					break;
				case 3:
					System.out.println("Mini Statement");
					b.miniStatement();
			}
		}while(choice!=5);
		
	}
}
