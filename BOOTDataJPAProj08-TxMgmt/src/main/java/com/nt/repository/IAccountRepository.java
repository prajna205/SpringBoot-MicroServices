package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Account;

public interface IAccountRepository extends JpaRepository<Account, Long> {

	@Query("update Account set amount=amount- :amount where acno=:srcAcno")
	@Modifying
	public int withdrawMoney(long srcAcno,double amount);
	@Query("update Account set amount=amount+ :amount where acno=:destAcno")
	@Modifying
	public int depositeMoney(long destAcno,double amount) ;
}
