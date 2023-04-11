package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Component
public class CallingPlProceduretestRunner implements CommandLineRunner{
	@Autowired
	private EntityManager manager;
	@Override
	public void run(String... args) throws Exception {
		//create stored procedure query object having pl/sql procedure name ,result type
		StoredProcedureQuery query 	=manager.createStoredProcedureQuery("P_GET_ACTORS_BY_CATEGORIES",Actor.class);
		//register both IN,OUT  params of PL/SQL procedure
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Actor.class, ParameterMode.REF_CURSOR);
		//set values to In params
		query.setParameter(1, "star");
		query.setParameter(2, "Hero");
		//call pl/sql procedure
		List<Actor> list=query.getResultList();
		//process the result
		list.forEach(System.out::println);
	}

}
