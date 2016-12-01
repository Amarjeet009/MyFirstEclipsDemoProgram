package com.niit.thread;

public class Account {
	
	private int accountNumber;
	private double balance;
	                        //accountNumber is used in test Class
	public Account(int accountNumber, double balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void deposit(int amount)
	{
		balance=balance+amount;
		
		System.out.println("Balance after depost amount :"+amount+"is :"+balance);
	}

	public void withdraw(int amount)
	{
		balance=balance-amount;
		
		System.out.println("Balance after withdraw amount :"+amount+"is :"+balance);
	}

}
