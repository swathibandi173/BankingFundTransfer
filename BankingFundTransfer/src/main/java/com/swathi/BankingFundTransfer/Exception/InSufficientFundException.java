package com.swathi.BankingFundTransfer.Exception;

public class InSufficientFundException extends RuntimeException{
	
	public InSufficientFundException()
	  {
		  super();
	  }
	  public InSufficientFundException(String message)
	  {
		  super(message);
	  }

}
