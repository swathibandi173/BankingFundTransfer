package com.swathi.BankingFundTransfer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swathi.BankingFundTransfer.Entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
	
	public Long findByAccountNo(long accountNo);
	public Account findByAccountNoAndUserUserId(long accountNo,long userId);

}