package com.nbg.transactions;

import java.io.Serializable;
import java.util.Date;

public abstract class Transaction implements Serializable
{
	protected int transId;
	protected Date date;
	protected double amount;
	protected int accNum;
	protected String details;
	
	
	public Transaction()
	{
		transId = 0;
		date = new Date();
		amount = 0.0;
		accNum = 0;
		details = "";
	}
	
	public int getTransId()
	{
		return transId;
	}
	public void setTransId(int transId) 
	{
		this.transId = transId;
	}
	public Date getDate() 
	{
		return date;
	}
	public void setDate(Date date) 
	{
		this.date = date;
	}
	public double getAmount() 
	{
		return amount;
	}
	public void setAmount(double amount) 
	{
		this.amount = amount;
	}
	public int getAccNum() 
	{
		return accNum;
	}
	public void setAccNum(int accNum) 
	{
		this.accNum = accNum;
	}
	public String getDetails() 
	{
		return details;
	}
	public void setDetails(String details) 
	{
		this.details = details;
	}
	
	
}

