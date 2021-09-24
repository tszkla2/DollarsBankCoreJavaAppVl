package com.dollarsbank.model;

import java.util.List;
import java.time.LocalDateTime;

public class SavingsAccount extends Account {

	private double balance;
	private String accountID;
	private String password;
	private LocalDateTime ldt = LocalDateTime.now();
	
	public SavingsAccount(double balance, String accountID, String password) {
		super();
		this.balance = balance;
		this.accountID = accountID;
		this.password = password;
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
		
	}

	@Override
	public void deposit(double money) {
		ldt = LocalDateTime.now();
		balance = balance + money;
		
	}

	@Override
	public List<String> get5History() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addHistory(String transaction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayHistory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(double money, String accountID) {
		// TODO Auto-generated method stub
		
	}


}
