package com.nt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.entity.Actor;

public interface IActorRepository extends JpaRepository<Actor, Integer> {
	
	/*@Query("from Actor where category=?1")
	@Query("from com.nt.entity.Actor a where a.category=?1")
	@Query("select a from com.nt.entity.Actor a where a.category=?1")
	public Iterable<Actor> searchActorsByCategory(@Param("role")String category);
	@Query("from Actor  where category=:role")
	
	public Iterable<Actor> searchActorsByCategory(String role);
	*/
	
	//Entity Query giving single record
	@Query("from Actor where mobileNo=:mobileNo")
	public Actor getActorByMobileNo(long mobileNo);
	
	//scalar Query giving multiple specific col values
		@Query("select aid,aname,category from Actor where category=:category")
		public Object getActorDataBycategory(String category);
		
		//scalar Query giving single specific col values
		@Query("select aname from Actor where category=:category")
		public String getActorNameBycategory(String category);
		
		@Query("select count(*) from Actor where category=:category")
		public int getActorsCount(String category);
	}
