package com.swathi.BankingFundTransfer.Exception;

public class InvalidCredentialsException extends RuntimeException
{
    
	public InvalidCredentialsException()
    {
    	super();
    	
    }
    public InvalidCredentialsException(String message)
    {
    	super(message);
    }
    public InvalidCredentialsException(String message,Throwable t)
    {
    	super(message,t);
    }
}