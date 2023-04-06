package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;


@Component
public class QueryMethodsTestRunner implements CommandLineRunner {
	@Autowired
	private IActorRepository actorRepo;
	
	@Override
	public void run(String... args) throws Exception {
		//actorRepo.searchActorsByCategory("star").forEach(System.out::println);
		Actor actor= actorRepo.getActorByMobileNo(8888888L);
		if (actor != null) {
			System.out.println("Actor info:: "+actor);
		} 
		else {
			System.out.println("Actor not found");
		}
		
		System.out.println("=======================================");
		Object data=(Object) actorRepo.getActorDataBycategory("joker");
		Object result[]=(Object[]) data;
		for (Object object : result) {
			System.out.print(object+"...");
		}
		System.out.println();
		
		System.out.println("==========================================");
		String  name=actorRepo.getActorNameBycategory("Star");
		System.out.println("Actor name :: "+name);
		
		System.out.println("==========================================");
		System.out.println("Actor Counyt:: "+actorRepo.getActorsCount("star"));

	}
}
