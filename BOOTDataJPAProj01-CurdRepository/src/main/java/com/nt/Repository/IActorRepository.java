package com.nt.Repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Actor;

public interface IActorRepository extends CrudRepository<Actor, Integer> {
	
}
