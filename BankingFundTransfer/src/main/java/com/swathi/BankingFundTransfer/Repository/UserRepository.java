package com.swathi.BankingFundTransfer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swathi.BankingFundTransfer.Entity.User;



@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	
	public User findByUserName(String userName);
	
	public User findByUserId(long userId);

	
	

}
