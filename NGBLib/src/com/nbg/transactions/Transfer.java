package com.nbg.transactions;

import java.util.Date;

public class Transfer extends Transaction
{
	private String recipientEmail;
	private String transferString;
	
	public Transfer()
	{
		transId = 0;
		date = new Date();
		amount = 0.0;
		accNum = 0;
		details = "";
		recipientEmail = "";
		transferString = "";
	}
	
	public Transfer (String recipientEmail, double amount )
	{
		this.recipientEmail = recipientEmail;
		//accBalance = accBalance - amount;
	}
	
//	

	public String getRecipientEmail()
	{
		return recipientEmail;
	}

	public void setRecipientEmail(String recipientEmail)
	{
		this.recipientEmail = recipientEmail;
	}
	
	public String toString()
	{
		transferString = transId + "\t" + date  + "\t" + amount  + "\t" + accNum  + "\t" + details;
		
		return transferString;
	}
	
}
