package com.nt.runners;

import javax.swing.text.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.entity.ResultView;
import com.nt.repository.IActorRepository;
import com.nt.view.ResultView1;
import com.nt.view.ResultView2;
import com.nt.view.ResultView3;

@Component
public class FinderMethodsTestRunner implements CommandLineRunner {
	@Autowired
	private IActorRepository actorRepo;
	
	@Override
	public void run(String... args) throws Exception {
		/*	Iterable<ResultView1> it= actorRepo.findByCategoryContainingIgnoreCase("s", ResultView1.class);
			it.forEach(view1->{
				System.out.println(view1.getAid()+"----"+view1.getAname());
			});
			
			System.out.println("=========================================");
			Iterable<ResultView2> it1= actorRepo.findByCategoryContainingIgnoreCase("h", ResultView2.class);
			it1.forEach(view2->{
				System.out.println(view2.getCategory()+"----"+view2.getMobileNo());
			});
			
			System.out.println("=========================================");
			Iterable<ResultView3> it2= actorRepo.findByCategoryContainingIgnoreCase("c", ResultView3.class);
			it2.forEach(view3->{
				System.out.println(view3.getCategory()+"---"+view3.getAid()+"---"+view3.getAname());
			});*/
		
		System.out.println("============================================");
		Actor actor=new Actor();
		actor.setAname("Lambi");
		actor.setCategory("Star");
		actor.setMobileNo(8888L);
		System.out.println("Object is saved with id value :: "+actorRepo.save(actor).getAid());
	}
}
