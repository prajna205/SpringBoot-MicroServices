package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IActorRepository;


@Component
public class NativeSQLTestRunner implements CommandLineRunner {
	@Autowired
	private IActorRepository actorRepo;
	
	@Override
	public void run(String... args) throws Exception {
		/*int count=actorRepo.insertActor("Biswa", "Hero", 44444L);
		System.out.println(count==0?"Record not inserted":"Record inserted");*/
		
		System.out.println("DAte:: "+actorRepo.showDate());
	}
}
