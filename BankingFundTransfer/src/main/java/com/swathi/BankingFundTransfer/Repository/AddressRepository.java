package com.swathi.BankingFundTransfer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swathi.BankingFundTransfer.Entity.Address;



@Repository
public interface AddressRepository extends JpaRepository<Address,Long>{

}