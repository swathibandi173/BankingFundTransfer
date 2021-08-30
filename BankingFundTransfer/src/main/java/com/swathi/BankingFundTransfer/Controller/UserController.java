package com.swathi.BankingFundTransfer.Controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swathi.BankingFundTransfer.Dto.AccountDto;
import com.swathi.BankingFundTransfer.Dto.BeneficiaryDto;
import com.swathi.BankingFundTransfer.Dto.FundTransferDto;
import com.swathi.BankingFundTransfer.Entity.UserCredentials;
import com.swathi.BankingFundTransfer.Exception.UserNameAlreadyExistsException;
import com.swathi.BankingFundTransfer.Service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value ="/users")
@EnableTransactionManagement
@Slf4j
public class UserController {
	
private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
    @PostMapping("/registration")
	public ResponseEntity<Object> userAccountOpening(@Valid @RequestBody AccountDto request)  throws UserNameAlreadyExistsException
	{
    	logger.info("inside customerAccountOpening");
    	Object saveUsererDetails = userService.saveUserDetails(request);
		return new ResponseEntity<>(saveUsererDetails,HttpStatus.OK);
	}
    
    @PostMapping("/benefiary/{userName}")
	public ResponseEntity<Object> saveBeneficiaryDetails(@Valid @RequestBody BeneficiaryDto request,@PathVariable("userName") String userName)  
	{
    	logger.info("inside saveBeneficiaryDetails");
		return new ResponseEntity<>(userService.saveBeneficiary(request,userName),HttpStatus.OK);
	}
    
    @PostMapping("/login")
	public ResponseEntity<Object> checkLogindetails(@Valid @RequestBody UserCredentials userCredentials)  
	{
    	logger.info("inside checkLogindetails");
		return new ResponseEntity<>(userService.checkLogindetails(userCredentials),HttpStatus.OK);
	}
    @PostMapping("/transfer/{userName}")
   	public ResponseEntity<Object> fundTransfer(@Valid @RequestBody FundTransferDto fundTransferDto,@PathVariable("userName") String userName)  
   	{
       	logger.info("inside checkCredentials");
   		return new ResponseEntity<>(userService.fundTransfer(fundTransferDto,userName),HttpStatus.OK);
   	}
   
	

}
