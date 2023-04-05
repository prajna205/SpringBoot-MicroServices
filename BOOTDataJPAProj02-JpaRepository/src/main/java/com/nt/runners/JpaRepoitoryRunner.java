package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.IActorService;

@Component
public class JpaRepoitoryRunner implements CommandLineRunner {
	@Autowired
	private IActorService service;
	
	@Override
	public void run(String... args) throws Exception {
		//----------deleteAllActorsByIdsInBatch()----------------
//		System.out.println(service.removeActorsBtIdsInBatch(List.of(312,56,100,200,300)));	
		//----------getReferenceById()----------------
		/*	try {
				System.out.println("12 actor is info:: "+ service.searchActorById(12));
			} catch (Exception e) {
				System.out.println("record not found");
				e.printStackTrace();
			}*/
		System.out.println("----------find(Example example,Sort sort----------");
		try {
			Actor actor=new Actor("Ram","star",8888888L);
			List<Actor> list = service.searchActorByActor(actor, true, "aname");
			list.forEach(System.out::println);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
