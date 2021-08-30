package com.swathi.BankingFundTransfer.Exception;

public class InvalidAccountNoException extends RuntimeException
{
    
	
	public InvalidAccountNoException()
    {
    	super();
    	
    }
    public InvalidAccountNoException(String message)
    {
    	super(message);
    }
    public InvalidAccountNoException(String message,Throwable t)
    {
    	super(message,t);
    }
}