package com.swathi.BankingFundTransfer.Exception;

public class UserNameAlreadyExistsException extends RuntimeException {

	 public UserNameAlreadyExistsException()
	  {
		  super();
	  }
	  public UserNameAlreadyExistsException(String message)
	  {
		  super(message);
	  }
	  
	  public UserNameAlreadyExistsException(String message, Throwable t)
	  {
		  super(message,t);
	  }

}
