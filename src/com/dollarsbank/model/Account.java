package com.dollarsbank.model;

import java.util.List;

public abstract class Account {
	
	public abstract void withdraw(double money);
	public abstract void deposit(double money);
	public abstract List<String> get5History();
	public abstract void addHistory(String transaction);
	public abstract void displayHistory();
	public abstract void transfer(double money, String accountID);
}
