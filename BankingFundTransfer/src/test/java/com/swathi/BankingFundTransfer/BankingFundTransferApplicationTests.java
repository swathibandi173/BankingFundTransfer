package com.swathi.BankingFundTransfer;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.swathi.BankingFundTransfer.Dto.AccountDto;
import com.swathi.BankingFundTransfer.Dto.BeneficiaryDto;
import com.swathi.BankingFundTransfer.Dto.FundTransferDto;
import com.swathi.BankingFundTransfer.Entity.Account;
import com.swathi.BankingFundTransfer.Entity.Beneficiary;
import com.swathi.BankingFundTransfer.Entity.User;
import com.swathi.BankingFundTransfer.Entity.UserCredentials;
import com.swathi.BankingFundTransfer.Exception.InSufficientFundException;
import com.swathi.BankingFundTransfer.Exception.InvalidCredentialsException;
import com.swathi.BankingFundTransfer.Exception.ResourceNotFoundException;
import com.swathi.BankingFundTransfer.Exception.UserNameAlreadyExistsException;
import com.swathi.BankingFundTransfer.Repository.AccountRepository;
import com.swathi.BankingFundTransfer.Repository.BeneficiaryRepository;
import com.swathi.BankingFundTransfer.Repository.UserCredentialsRepository;
import com.swathi.BankingFundTransfer.Repository.UserRepository;
import com.swathi.BankingFundTransfer.Service.UserService;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class BankingFundTransferApplicationTests {

	@Autowired
	UserService userService;
	
	@MockBean
	UserCredentialsRepository custCredRepo;

	@MockBean
	UserRepository custRepo;
	
	@MockBean
	AccountRepository accRepo;

	@MockBean
	BeneficiaryRepository beneficiaryRepo;


	static User customer = new User();
	static Beneficiary benificary = new Beneficiary();
	static Account account = new Account();
	static UserCredentials custCredentials=new UserCredentials();
	static BeneficiaryDto dto = new BeneficiaryDto();
	static FundTransferDto fundTranferDto = new FundTransferDto();
	static AccountDto accountDto = new AccountDto();

	String name = "AI0326";

	@BeforeAll
	public static void setUp() {
		// mock customer credentials as in database
		custCredentials.setUserName("AI0326");
		custCredentials.setPassword("bandi");
		
		
		// mock customer details as in database
		customer.setUserId(1l);
		customer.setUserName("AI0326");
		customer.setFirstName("Karthik");
		customer.setLastName("Maddika");
		customer.setDateOfBirth(LocalDate.now());
		customer.setGender("male");
		customer.setMobileNumber(Long.getLong("9989705293"));
		customer.setEmailId("karthik@gmail.com");
		customer.setPanCard("AULPK1987H");
		customer.setAadharCard("400607192799");
				
		// mock account details as in database
		account.setAccountId(1l);
		account.setAvailableBalance((double) 4500);
		account.setOpeningDeposit((double) 4500);
		account.setBankName("HDFC");
		account.setBranchName("Kukatpally");
		account.setIfscCode("HDFC00314");
		account.setCreationDate(new Date());
		account.setUser(customer);
		account.setAccountType("Checking");
		account.setAccountNo(123456l);
				
				
		// mock benificary details as in database
		benificary.setBeneficiaryAccountNo(4567);
		benificary.setBeneficiaryId(1l);
		benificary.setBeneficiaryName("aryan");
		benificary.setUser(customer);
		benificary.setIfscCode("HDFC00314");
		benificary.setTransferLimit(6000);
				
		//set values for fund transfer dto
		
		fundTranferDto.setFromAccount("123456");
		fundTranferDto.setToAccount("4567");
		fundTranferDto.setMessage("Expenses");
		fundTranferDto.setTransferAmount("1000");
		
		
		//set values for BeneficiaryDTO
		dto.setBeneficiaryAccountNo("4567");
		dto.setBeneficiaryName("Narsi");
		dto.setIfscCode("HDF00314");
		dto.setTransferLimit("1000");
		
		//set values for accountopening dto
		accountDto.setUserName("AI0327");
		accountDto.setFirstName("Karthik");
		accountDto.setLastName("Reddy");
		accountDto.setDateOfBirth("2018-01-18");
		accountDto.setGender("male");
		accountDto.setMobileNumber("7680092889");
		accountDto.setEmailId("karthik@gmail.com");
		accountDto.setPanCard("AULPK1507H");
		accountDto.setAadharCard("400607192799");
		accountDto.setAddress1("Adress1");
		accountDto.setAddress2("Address2");
		accountDto.setCity("KP");
		accountDto.setState("Hyd");
		accountDto.setZipCode("500072");
		accountDto.setOpeningDeposit("4500");
		accountDto.setBankName("HDFC");
		accountDto.setBranchName("Kukatpally");
		accountDto.setIfscCode("HDFC00314");
		accountDto.setAccountType("Checking");
		
		
	}
	
	@Test
	@DisplayName("Account Opening")
	@Order(1)
	public void testCreateAccountOpening() throws UserNameAlreadyExistsException {
		Mockito.when(custRepo.findByUserName(customer.getUserName())).thenReturn(customer);
		assertEquals(HttpStatus.OK, userService.saveUserDetails(accountDto).getStatusCode());
	}
	

	@Test
	@DisplayName("Check Customer Login Credentials")
	@Order(2)
	public void testAuthenticateUser() throws InvalidCredentialsException {
		Mockito.when(custCredRepo.findByUserNameAndPassword("AI0326", "bandi")).thenReturn(custCredentials);
		assertEquals(HttpStatus.OK, userService.checkLogindetails(custCredentials).getStatusCode());
	}

	@Test
	@DisplayName("Save Beneficiary")
	@Order(3)
	public void testSaveBenificary() throws ResourceNotFoundException, MethodArgumentNotValidException {
		Mockito.when(custRepo.findByUserName(customer.getUserName())).thenReturn(customer);
		assertEquals(HttpStatus.OK, userService.saveBeneficiary(dto, name).getStatusCode());
	}
	
	@Test
	@DisplayName("Test FundTransfer Transaction")
	@Order(4)
	public void testFundTransfer() throws ResourceNotFoundException, InSufficientFundException {
		Mockito.when(custRepo.findByUserName(customer.getUserName())).thenReturn(customer);
		Mockito.when(accRepo.findByAccountNoAndUserUserId(account.getAccountNo(), 1l)).thenReturn(account);
		Mockito.when(beneficiaryRepo.findByBeneficiaryAccountNoAndUserUserId(Long.valueOf(benificary.getBeneficiaryAccountNo()),1l)).thenReturn(benificary);
		
		assertEquals(HttpStatus.OK, userService.fundTransfer(fundTranferDto, name).getStatusCode());
	}
	
	private void assertEquals(HttpStatus ok, HttpStatus statusCode) {
		// TODO Auto-generated method stub
		
	}

}
