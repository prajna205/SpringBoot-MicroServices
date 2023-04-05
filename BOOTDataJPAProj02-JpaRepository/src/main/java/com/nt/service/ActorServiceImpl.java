package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;

@Service("actorService")
public class ActorServiceImpl implements IActorService {
	@Autowired
	private IActorRepository actorRepo;

	@Override
	public String removeActorsBtIdsInBatch(List<Integer> ids) {
		List<Actor> list=actorRepo.findAllById(ids);
		int count=list.size();
		actorRepo.deleteAllByIdInBatch(ids);
		return count+" no of records are deleted.";
	}

	@Override
	public Actor searchActorById(int aid) {
		return actorRepo.getReferenceById(aid);
	}

	@Override
	public List<Actor> searchActorByActor(Actor actor, boolean order, String... properties) {
		Example example = Example.of(actor);
		Sort sort= Sort.by(order?Direction.ASC:Direction.DESC,properties);
		List<Actor> list =actorRepo.findAll(example,sort);
		return list;
	}
}
