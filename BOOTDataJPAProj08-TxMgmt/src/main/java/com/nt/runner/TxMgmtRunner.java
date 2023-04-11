package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IBankService;

@Component
public class TxMgmtRunner implements CommandLineRunner {
	@Autowired
	private IBankService service;
	
	@Override
	public void run(String... args) throws Exception {
		try {
			String msg=service.transferMoney(102, 103, 5000.0);
			System.out.println(msg);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
