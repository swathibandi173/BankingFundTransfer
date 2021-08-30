package com.swathi.BankingFundTransfer.Exception;

public class TransferLimitException extends RuntimeException
{
    
	
	public TransferLimitException()
    {
    	super();
    	
    }
    public TransferLimitException(String message)
    {
    	super(message);
    }
    public TransferLimitException(String message,Throwable t)
    {
    	super(message,t);
    }
}
