package com.dollarsbank.model;

public abstract class Account {
	
	public abstract void withdraw(double money);
	public abstract void deposit(double money);
	public abstract void addHistory(String transaction);
	public abstract void displayHistory();
	public abstract void transfer(double money, String transferID);
}
