package com.swathi.BankingFundTransfer.Response;

import java.io.Serializable;

public class AccountCreationAcknowledgement implements Serializable
{
	   private static final long serialVersionUID = -4124940610423832188L;
	
	private String statusMsg;

	public AccountCreationAcknowledgement() {
		super();
	}

	public AccountCreationAcknowledgement(String statusMsg) {
		super();
		this.statusMsg = statusMsg;
	}

	public String getStatusMsg() {
		return statusMsg;
	}

	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}

	@Override
	public String toString() {
		return "AccountCreationAcknowledgement [statusMsg=" + statusMsg + "]";
	}
	
	

}
