package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.entity.Actor;
import com.nt.service.IActorMgmtservice;

@SpringBootApplication
public class BootDataJpaProj01CurdRepositoryApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootDataJpaProj01CurdRepositoryApplication.class, args);
		//get service class obj ref
		IActorMgmtservice service=ctx.getBean("ActorService",IActorMgmtservice.class);
		//invoke method
		try {
			Actor actor=new Actor();
			actor.setAname("vijay");actor.setCategory("Hero");actor.setMobNo(9999999999L);
			String result=service.registerActor(actor);
			System.out.println(result);
		} 
		catch (DataAccessException dae) {
			dae.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
