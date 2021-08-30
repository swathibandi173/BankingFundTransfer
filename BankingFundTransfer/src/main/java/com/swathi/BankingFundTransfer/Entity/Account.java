package com.swathi.BankingFundTransfer.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_id")
	private Long accountId;

	
	private Long accountNo;


	private String accountType;


	private double openingDeposit;

	
	private double availableBalance;


	private String bankName;


	private String branchName;


	private Date creationDate;
	 
	
	private String ifscCode;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Account() {
		super();
	}

	public Account(Long accountId, Long accountNo, String accountType, double openingDeposit, double availableBalance,
			String bankName, String branchName, Date creationDate, String ifscCode) {
		super();
		this.accountId = accountId;
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.openingDeposit = openingDeposit;
		this.availableBalance = availableBalance;
		this.bankName = bankName;
		this.branchName = branchName;
		this.creationDate = creationDate;
		this.ifscCode = ifscCode;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getOpeningDeposit() {
		return openingDeposit;
	}

	public void setOpeningDeposit(double openingDeposit) {
		this.openingDeposit = openingDeposit;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
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

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	

}
