package com.dollarsbank.model;

import java.time.LocalDateTime;

//Model Class for the Customer
public class Customer extends SavingsAccount {

	private String name;
	private String address;
	private String phoneNumber;
	private LocalDateTime ldt = LocalDateTime.now();
	
	public Customer(String name, String address, String phoneNumber, String accountID, String password, double balance) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		setAccountID(accountID);
		setPassword(password);
		setBalance(balance);
		
		//Adds initial balance amount as well as time to the customer account and adds it to the history
		addHistory("Initial balance in account ["+ accountID +"]\n" + "Balance - " + balance + " as of " + ldt + "\n");
		System.out.println();
	}
	
	public Customer() {
		super();
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
