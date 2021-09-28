package com.dollarsbank.utility;

import com.dollarsbank.model.Customer;

public class ConsolePrinterUtility {
	
	public void menu() {
		System.out.println(ColorsUtility.ANSI_BLUE + "+---------------------------+");
		System.out.println("|  TOM'S BANK Welcomes You! |");
		System.out.println("+---------------------------+" + ColorsUtility.ANSI_RESET);
		System.out.println("1. Create New Account");
		System.out.println("2. Login");
		System.out.println("3. Exit.");
		System.out.println();
		System.out.println(ColorsUtility.ANSI_GREEN + "Enter Choice (1,2, or 3) :" + ColorsUtility.ANSI_RESET);
	}
	
	public void login() {
		System.out.println(ColorsUtility.ANSI_BLUE + "+-----------------------+");
		System.out.println("|  Enter Login Details  |");
		System.out.println("+-----------------------+" + ColorsUtility.ANSI_RESET);
}
	
	public void welcomeCust()
	{
		System.out.println(ColorsUtility.ANSI_BLUE + "+----------------------+");
		System.out.println("|  WELCOME Customer!!! |");
		System.out.println("+----------------------+" + ColorsUtility.ANSI_RESET);
		System.out.println("1. Deposit Amount");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Funds Transfer.");
		System.out.println("4. View 5 Recent Transactions");
		System.out.println("5. Display Customer Information");
		System.out.println("6. Sign Out");
		System.out.println();
		System.out.println(ColorsUtility.ANSI_GREEN + "Enter Choice (1,2,3,4,5, or 6) :" + ColorsUtility.ANSI_RESET);
	}
	
	public void customerInformation(Customer customer) {
		System.out.println(ColorsUtility.ANSI_BLUE + "+----------------------+");
		System.out.println("|   Customer Details   |");
		System.out.println("+----------------------+" + ColorsUtility.ANSI_RESET);
		System.out.println(ColorsUtility.ANSI_PURPLE + "+----------------------+");
		System.out.println("|        Account       |");
		System.out.println("+----------------------+");
		System.out.println(" ACCOUNT ID: " + customer.getAccountID());
		System.out.println(" PASSWORD: " + customer.getPassword());
		System.out.println(" BALANCE: " + customer.getBalance());
		System.out.println("+----------------------+");
		System.out.println("|       Customer       |");
		System.out.println("+----------------------+");
		System.out.println(" NAME: " + customer.getName());
		System.out.println(" ADDRESS: " + customer.getAddress());
		System.out.println(" PHONE: " + customer.getPhoneNumber() + ColorsUtility.ANSI_RESET);
	}
	
	public void invalidCreds()
	{
		System.out.println(ColorsUtility.ANSI_RED + "Invalid Credentials. Try Again!" + ColorsUtility.ANSI_RESET);
	}
	
	public void invalidOption()
	{
		System.out.println(ColorsUtility.ANSI_RED + "Invalid Option. Try Again!" + ColorsUtility.ANSI_RESET);
	}
}
