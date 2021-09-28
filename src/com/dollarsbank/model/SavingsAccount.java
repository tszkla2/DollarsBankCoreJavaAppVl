package com.dollarsbank.model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class SavingsAccount extends Account {

	private double balance;
	private String accountID;
	private String password;
	private LocalDateTime ldt = LocalDateTime.now();
	
	private List<String> transactionHistory = new ArrayList<String>();
	
	public SavingsAccount() {
		super();
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	@Override
	public void withdraw(double money) {
		ldt = LocalDateTime.now();
		balance = balance - money;
		
		addHistory("Withdrawn " + money + " from account ["+ accountID +"]\n" + "Balance - " + balance + " as of " + ldt + "\n ");
		System.out.println();
	}

	@Override
	public void deposit(double money) {
		ldt = LocalDateTime.now();
		balance = balance + money;
		
		addHistory("Deposited " + money + " into account ["+ accountID +"]\n" + "Balance - " + balance + " as of " + ldt + "\n ");
		System.out.println();
	}

	@Override
	public void addHistory(String transaction) {
		transactionHistory.add(transaction);
		
	}

	@Override
	public void displayHistory() {
		int size = transactionHistory.size();
		int skip = 0;
		
		if(size >= 5) {
			skip = size - 5;
		}
		
		for (String string : transactionHistory) {
			if(skip > 0) {
				skip = skip - 1;
				continue;
			}
			System.out.println(string);
		}
		
	}

	@Override
	public void transfer(double money, String transferID) {
		ldt = LocalDateTime.now();
		balance = balance - money;
		
		addHistory("Transfered " + money + " into account ["+ transferID +"]\n" + "Balance - " + balance + " as of " + ldt + "\n ");
		System.out.println();
	}

	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + ", accountID=" + accountID + ", password=" + password
				+ ", transactionHistory=" + transactionHistory + "]";
	}


}
