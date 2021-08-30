package com.swathi.BankingFundTransfer.Dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class FundTransferDto {
	 @Size(min = 5, max = 12)
	 @NotNull(message="provide from account no ,only digits")
	 @Pattern(regexp = "[0-9]{12}",message = "provide a valid from account no") 
	private String fromAccount;
	 
	 @Size(min = 5, max = 13)
	 @NotNull(message="provide to account no ,only digits")
	 @Pattern(regexp = "[0-9]{13}",message = "provide a valid to account no") 
	private String toAccount;
	
	 @NotNull(message="provide transfer amount")
	 @Pattern(regexp = "[0-9.#]+",message = "provide valid Transfer amount")
	 private String transferAmount;
	 
	 private String message;

	public FundTransferDto() {
		super();
	}

	public FundTransferDto(
			@Size(min = 5, max = 12) @NotNull(message = "provide from account no ,only digits") @Pattern(regexp = "[0-9]{12}", message = "provide a valid from account no") String fromAccount,
			@Size(min = 5, max = 13) @NotNull(message = "provide to account no ,only digits") @Pattern(regexp = "[0-9]{13}", message = "provide a valid to account no") String toAccount,
			@NotNull(message = "provide transfer amount") @Pattern(regexp = "[0-9.#]+", message = "provide valid Transfer amount") String transferAmount,
			String message) {
		super();
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.transferAmount = transferAmount;
		this.message = message;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public String getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(String transferAmount) {
		this.transferAmount = transferAmount;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "FundTransferDto [fromAccount=" + fromAccount + ", toAccount=" + toAccount + ", transferAmount="
				+ transferAmount + ", message=" + message + "]";
	}

	
	 

}
