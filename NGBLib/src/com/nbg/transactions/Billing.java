package com.nbg.transactions;

public class Billing extends Transaction
{
	private String serviceProvider;
	
	public Billing()
	{
		serviceProvider = "";
	}
	public Billing (String serviceProvider, double amount)
	{
		this.serviceProvider = serviceProvider;
	}
}
