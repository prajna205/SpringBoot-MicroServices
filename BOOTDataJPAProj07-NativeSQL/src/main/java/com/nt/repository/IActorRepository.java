package com.nt.repository;


import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Actor;

import jakarta.transaction.Transactional;

@Transactional
public interface IActorRepository extends JpaRepository<Actor, Integer> {
	
	@Query(nativeQuery = true,value = "INSERT INTO DATA_JPA_ACTOR VALUES(DATA_JPA_ACTOR_SEQ.NEXTVAL,?,?,?)")
	@Modifying
	public int insertActor(String name,String role,long mobileNo);
	
	@Query(nativeQuery = true,value="SELECT SYSDATE FROM DUAL")
	public Date showDate();
	}
