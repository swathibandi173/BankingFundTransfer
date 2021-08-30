package com.swathi.BankingFundTransfer.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class UserCredentials {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="userCredentials_id")
	 private Long userCredentialsId;
	 
	
	 private String userName;
	 

	 private String password;
	 

	 private int accountStatus;
	 
	 @OneToOne
	 @JoinColumn(name="user_id")
	 private User user;

	public UserCredentials() {
		super();
	}
	
	

	public UserCredentials(Long userCredentialsId, String userName, String password, int accountStatus, User user) {
		super();
		this.userCredentialsId = userCredentialsId;
		this.userName = userName;
		this.password = password;
		this.accountStatus = accountStatus;
		this.user = user;
	}



	public Long getUserCredentialsId() {
		return userCredentialsId;
	}

	public void setUserCredentialsId(Long userCredentialsId) {
		this.userCredentialsId = userCredentialsId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(int accountStatus) {
		this.accountStatus = accountStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	 

}
