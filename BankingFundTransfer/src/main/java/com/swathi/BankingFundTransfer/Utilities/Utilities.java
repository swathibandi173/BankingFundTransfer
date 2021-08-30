package com.swathi.BankingFundTransfer.Utilities;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Utilities {
	
	public LocalDateTime getDateTime()
	  {
		  return LocalDateTime.now();
		  
	  }
	  public long accountNumberGeneration() 
	  {
		  while (true) {
		        long number = (long)(Math.random() * 100000000 * 100000000); // had to use this as int's are to small for a 13 digit number.
		        if (String.valueOf(number).length() == 13)
		            return number;
		    }
	  
	  }

}