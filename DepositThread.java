package com.niit.thread;

public class DepositThread  extends Thread {
	
	private Account account;
	int amount;
	public DepositThread(Account account, int amount)
	{
		this.account=account;
		this.amount=amount;
		
	}
	@Override
	public void run()
	{
		account.deposit(amount);
	}

}
