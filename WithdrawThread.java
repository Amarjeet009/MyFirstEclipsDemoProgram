package com.niit.thread;

public class WithdrawThread extends Thread {
	
	private Account account;
	int amount;
	public WithdrawThread(Account account, int amount)
	{
		this.account=account;
		this.amount=amount;
		
	}
	public void run()
	{
		account.withdraw(amount);
	}

}


