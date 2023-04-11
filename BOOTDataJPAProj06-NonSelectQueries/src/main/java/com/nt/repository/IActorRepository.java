package com.nt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Actor;
import jakarta.transaction.Transactional;

@Transactional
public interface IActorRepository extends JpaRepository<Actor, Integer> {
	
	@Query("update Actor set mobileNo=:newMobileNo where aid=:aid")
	@Modifying
	public int updateActorMobileNoByaid(long newMobileNo, int aid);
	
	@Query("delete from Actor where category=:category")
	@Modifying
	public int deleteActorsByCategory(String category);
}
