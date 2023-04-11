package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.repository.IAccountRepository;

import jakarta.transaction.Transactional;

@Service("bankService")
public class BankServiceImpl implements IBankService {
	@Autowired
	private IAccountRepository acntRepo;
	 
	@Override
	@Transactional
	public String transferMoney(long srcAcno, long destAcno, double amount) {
		int result1=acntRepo.withdrawMoney(srcAcno, amount);
		int result2=acntRepo.depositeMoney(destAcno, amount);
		if (result1==0 || result2==0) 
			throw new RuntimeException("problem in money transfer.");
		return "money transfered from "+srcAcno+" to "+destAcno;
	}

	
}
