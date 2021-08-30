package com.swathi.BankingFundTransfer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swathi.BankingFundTransfer.Entity.Beneficiary;

@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary,Long>{
	
	public Beneficiary findByBeneficiaryAccountNoAndUserUserId(long accountNo,long userId);

}
