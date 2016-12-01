package com.niit.thread;

public class Test {
	
	public static void main(String []args)
	{
		 System.out.println("Start banking Now !!!!");
		 
		Account a=new Account(10000111, 10000);
		
		DepositThread d;
		WithdrawThread w;
		
		d=new DepositThread(a,1000) ;
		d.start();
		
		
        w=new WithdrawThread (a,2000);
		w.start();
		d=new DepositThread(a,3000) ;
        d.start();
		
		w=new WithdrawThread (a,4000);
	    w.start();
		
	}

}
