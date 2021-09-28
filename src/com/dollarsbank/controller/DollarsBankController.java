package com.dollarsbank.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.dollarsbank.utility.ConsolePrinterUtility;
import com.dollarsbank.model.Customer;

public class DollarsBankController {

public static List<Customer> list = new ArrayList<Customer>();	
static {
	list.add(new Customer("Tom", "123 Drive", "123-456-7890", "001", "password", 500));
	list.add(new Customer("Bill", "456 Drive", "987-654-3210", "002", "password", 100));
}
	
int option = 0;
	
	public static ConsolePrinterUtility cpu = new ConsolePrinterUtility();
	Scanner scan = new Scanner(System.in);
	
	public Boolean run()
	{
		cpu.menu();
		option = 0;
		
		option = scan.nextInt();
		scan.nextLine();

		switch (option)
		{
			case 1:
//				System.out.println();
//				createAccount();
//				System.out.println();
//				scan.reset();
				break;
				
			case 2:
				System.out.println();
				login();
				scan.reset();
				break;
				
			case 3:
				exit();
				break;
				
			default:
				break;
				
		}
		
		System.out.flush();

		return true;
	}
	
	
	public void exit() {
		System.exit(0);
	}
	
	public void login()
	{
		String accountID = "";
		String password = "";

		cpu.login();
		System.out.println("Account Id: ");
		accountID = scan.nextLine();
		System.out.println("Password: ");
		password = scan.nextLine();
		System.out.println();
		
		for (Customer customer : list)
		{
			try {
				if (customer.getAccountID().equals(accountID) && customer.getPassword().equals(password)) {
				int i = list.indexOf(customer);
				welcomeCustomer(i);
				break;
				}
			}catch (InputMismatchException e) {
				scan.nextLine();
				cpu.invalidCreds();
			}
		}
	}

	public void welcomeCustomer(int i) {
		boolean signOut = false;
		double money = 0;
		int welcomeOption = 0;
		
		while(!signOut)
		{
			cpu.welcomeCust();
			
			try {
				welcomeOption = scan.nextInt();
				scan.nextLine();

			}catch (InputMismatchException e) {
				scan.nextLine();
				welcomeOption = 0;
				cpu.invalidOption();

			}
			switch (welcomeOption)
			{
				case 1:
					System.out.println("How much money would you like to deposit?");
					try {
						money = scan.nextDouble();
						scan.nextLine();
						if(money >= 0)
						{
							list.get(i).deposit(money);
							System.out.println("Deposit successful, your current balance is: " + list.get(i).getBalance());
							System.out.println();
						}
						else
						{
							System.out.println("Invalid input, please input >= 0");
							System.out.println();
						}
					}catch (InputMismatchException e) {
						scan.nextLine();
					}

					break;
					
				case 2:
					System.out.println("How much money would you like to withdraw?");
					try {
						money = scan.nextDouble();
						scan.nextLine();
						if(money >= 0 && money <= list.get(i).getBalance())
						{
							list.get(i).withdraw(money);
							System.out.println("Withdraw successful, your current balance is: " + list.get(i).getBalance());
							System.out.println();
						}
						else
						{
							System.out.println("Invalid input, please input >= 0 and <= balance\n" + "Balance = " + list.get(i).getBalance());
							System.out.println();
						}
					}catch (InputMismatchException e) {
						scan.nextLine();
					}
					break;
					
				case 3:
					int t = 0;
					boolean canTransfer = false;
					String accountID = "";
					
					System.out.println("Which Account Id do you want to transfer to?");
					
					try {
						accountID = scan.nextLine().toLowerCase();
						
						for (Customer customer : list)
						{
							if(customer.getAccountID().contentEquals(accountID))
							{
								canTransfer = true;
								t = list.indexOf(customer);
							}
						}
						if(!canTransfer)
						{
							System.out.println("Account doesn't exist! ");
							System.out.println();
							break;

						}
						System.out.println("How much are you transfering to " + accountID);
						money = scan.nextDouble();
						scan.nextLine();
						
						if(money >= 0 && money <= list.get(i).getBalance())
						{
							list.get(i).transfer(money, list.get(t).getAccountID());
							list.get(t).deposit(money);
							System.out.println("Transfer successful, your current balance is: " + list.get(i).getBalance());
							System.out.println();

						}
						else
						{
							System.out.println("Invalid input, please input >= 0 and <= balance\n" + "Balance = "+list.get(i).getBalance());
							System.out.println();
						}
					}catch(InputMismatchException e)
					{
						scan.nextLine();
					}
					break;
					
				case 4:
					list.get(i).displayHistory();
					System.out.println();
					break;
					
				case 5:
					cpu.customerInformation(list.get(i));
					System.out.println();
					break;
					
				case 6:
					signOut = true;
					System.out.println();
					run();
					break;

				default:

					break;
			}
		}
	}
	
}
