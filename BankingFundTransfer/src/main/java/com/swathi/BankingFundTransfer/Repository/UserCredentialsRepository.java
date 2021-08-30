package com.swathi.BankingFundTransfer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swathi.BankingFundTransfer.Entity.UserCredentials;

@Repository
public interface UserCredentialsRepository extends JpaRepository<UserCredentials,Long>{
	
	public String findByPassword(String password);
	public UserCredentials findByUserNameAndPassword(String userName,String password);

}
