package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.repository.IActorRepository;

@Component
public class QueryMethodsTestRunner implements CommandLineRunner {
	@Autowired
	private IActorRepository actorRepo;
	
	@Override
	public void run(String... args) throws Exception {
		int count=actorRepo.updateActorMobileNoByaid(11111L, 5);
		System.out.println(count ==1?" mobile no updated.":"Record not found.");
		
		int count1=actorRepo.deleteActorsByCategory("Star");
		System.out.println(count1 != 0? count1+" Record deleted.":"Record not found.");
	}
}
