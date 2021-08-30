package com.swathi.BankingFundTransfer.Dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AccountDto implements Serializable {
	private static final long serialVersionUID = 3994192272098493497L;

	@NotEmpty(message = "provide user name for login")
	@Size(min = 5, max = 50)
	@Pattern(regexp = "[a-zA-Z0-9]+")
	private String userName;

	@NotEmpty(message = "provide first name")
	@Size(min = 2, max = 50)
	@Pattern(regexp = "^[a-zA-Z0-9_ ]*$")
	private String firstName;
	
	@NotEmpty(message = "provide last name ")
	@Size(min = 2, max = 50)
	@Pattern(regexp = "^[a-zA-Z0-9_ ]*$")
	private String lastName;

	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@NotEmpty(message = "Provide date of birth ")
	@Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$",message = "Provide date of birth (yyyy-MM-dd) format" )
	private String dateOfBirth;

	@NotEmpty(message = "provide gender")
	private String gender;

	@NotNull(message = "provide mobile no ,only digits")
	@Pattern(regexp = "[0-9]{10}", message = "provide valid mobile no")
	private String mobileNumber;

	@NotEmpty(message = "Provide email id")
	@Email
	private String emailId;

	@NotEmpty(message = "provide pan number")
	@Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}", message = "provide valid pan number")
	private String panCard;

	@NotNull(message = "provide aadhaar number,only digits ")
	@Pattern(regexp = "[0-9]{12}", message = "provide valid aadhaar number")
	private String aadharCard;

	@NotEmpty(message = "Provide Customer Address1")
	@Size(min = 10, max = 100, message = "Address must be between 10 and 100 characters")
	private String address1;

	@NotEmpty(message = "Provide Customer Address2")
	@Size(min = 10, max = 150, message = "Address must be between 10 and 150 characters")
	private String address2;

	@NotEmpty(message = "provide city")
	@Pattern(regexp = "[a-zA-Z]+", message = "provide valid city")
	private String city;

	@NotEmpty(message = "provide state")
	@Pattern(regexp = "[a-zA-Z]+", message = "provide valid state")
	private String state;

	@NotNull(message = "provide zipCode no ,only digits")
	@Pattern(regexp = "[0-9]{6}", message = "provide valid zipCode")
	private String zipCode;

	@NotEmpty(message = "provide account type")
	@Size(min = 5, max = 10) // Value must contain at least 5 characters and a maximum of 10 characters
	@Pattern(regexp = "[a-zA-Z]+", message = "provide valid account type")
	private String accountType;

	@NotNull(message = "provide opening deposit ,only digits")
	@Pattern(regexp = "([^.\\d]+|[\\d+\\.]{2,})", message = "provide valid amount ")
	private String openingDeposit;


	@Size(min = 2, max = 25)
	@Pattern(regexp = "[a-zA-Z]+", message = "provide valid  Bank Name")
	@NotEmpty(message = "provide Bank Name")
	private String bankName;

	
	@Size(min = 5, max = 25)
	@Pattern(regexp = "[a-zA-Z]+", message = "provide valid  Branch Name")
	@NotEmpty(message = "provide Branch Name")
	private String branchName;
	
	@NotEmpty(message="provide IFSC Code")
	 @Size(min = 5, max = 15)
	 @Pattern(regexp = "[a-zA-Z0-9]+",message = "provide ifsCode")
	 private String ifscCode;


	public AccountDto() {
		super();
	}


	public AccountDto(String userName, String firstName, String lastName, String dateOfBirth, String gender,
			String mobileNumber, String emailId, String panCard, String aadharCard, String address1, String address2,
			String city, String state, String zipCode, String accountType, String openingDeposit, String bankName,
			String branchName, String ifscCode) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.panCard = panCard;
		this.aadharCard = aadharCard;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.accountType = accountType;
		this.openingDeposit = openingDeposit;
		this.bankName = bankName;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPanCard() {
		return panCard;
	}


	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}


	public String getAadharCard() {
		return aadharCard;
	}


	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}


	public String getAddress1() {
		return address1;
	}


	public void setAddress1(String address1) {
		this.address1 = address1;
	}


	public String getAddress2() {
		return address2;
	}


	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public String getOpeningDeposit() {
		return openingDeposit;
	}


	public void setOpeningDeposit(String openingDeposit) {
		this.openingDeposit = openingDeposit;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getBranchName() {
		return branchName;
	}


	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


	public String getIfscCode() {
		return ifscCode;
	}


	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}


	@Override
	public String toString() {
		return "AccountDto [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", mobileNumber=" + mobileNumber
				+ ", emailId=" + emailId + ", panCard=" + panCard + ", aadharCard=" + aadharCard + ", address1="
				+ address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ ", accountType=" + accountType + ", openingDeposit=" + openingDeposit + ", bankName=" + bankName
				+ ", branchName=" + branchName + ", ifscCode=" + ifscCode + "]";
	}
	 
	 

}
