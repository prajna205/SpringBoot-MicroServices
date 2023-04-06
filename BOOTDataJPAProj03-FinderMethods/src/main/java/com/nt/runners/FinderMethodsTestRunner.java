package com.nt.runners;

import javax.swing.text.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.entity.ResultView;
import com.nt.repository.IActorRepository;

@Component
public class FinderMethodsTestRunner implements CommandLineRunner {
	@Autowired
	private IActorRepository actorRepo;
	
	@Override
	public void run(String... args) throws Exception {
	System.out.println("Ram name actor info::");
	 actorRepo.findByAnameEquals("Ram").forEach(System.out::println);
	 System.out.println("star actor info::");
	 actorRepo.findByCategoryIs("star").forEach(System.out::println);
	 System.out.println(" Super star actor info::");
	 actorRepo.findByCategory("Super star").forEach(System.out::println);
		System.out.println("==========================================");
	 
	 Iterable<ResultView> it =actorRepo.findByCategoryEqualsIgnoreCase("Star");
	it.forEach(View->{
		System.out.println(View.getClass() );
		System.out.println(View.getAid()+"..."+View.getAname());
	});
	
	System.out.println("=================================================");
	ResultView view=actorRepo.findByMobNo(8888888L);
	System.out.println(view.getAid()+"...."+view.getAname());
	
	
	System.out.println("=================================================");
	Actor actor=actorRepo.findByMobNoIs(8888888L);
	System.out.println(actor);
	}
}
