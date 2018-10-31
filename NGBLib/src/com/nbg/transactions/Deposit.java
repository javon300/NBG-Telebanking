package com.nbg.transactions;

import java.util.Date;

public class Deposit extends Transaction 
{
	private String depositString; 
	public Deposit()
	{
		transId = 0;
		date = new Date();
		amount = 0.0;
		accNum = 0;
		details = "";
		depositString = "";
	}
	
	public Deposit(double amount)
	{
		this.amount = amount;
	}
	
	public String toString()
	{
		depositString = transId + "\t" + date  + "\t" + amount  + "\t" + accNum  + "\t" + details;
		return depositString;
	}
}
