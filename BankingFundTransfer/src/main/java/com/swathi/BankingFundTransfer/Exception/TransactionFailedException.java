package com.swathi.BankingFundTransfer.Exception;

public class TransactionFailedException extends RuntimeException
{

	public TransactionFailedException()
	  {
		  super();
	  }
	  public TransactionFailedException(String message)
	  {
		  super(message);
	  }
	  
	  public TransactionFailedException(String message, Throwable t)
	  {
		  super(message,t);
	  }
}