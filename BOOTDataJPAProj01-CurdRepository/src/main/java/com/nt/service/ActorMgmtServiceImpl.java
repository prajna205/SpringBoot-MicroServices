package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Repository.IActorRepository;
import com.nt.entity.Actor;

@Service("ActorService")
public class ActorMgmtServiceImpl implements IActorMgmtservice {

	@Autowired
	private IActorRepository actorRepo;
	@Override
	public String registerActor(Actor actor) {
		 Actor sactor=actorRepo.save(actor);
		return "Actor is registered with id : " +sactor.getAid();
	}

}
