package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Actor;
import com.nt.entity.ResultView;
import com.nt.view.View;

public interface IActorRepository extends JpaRepository<Actor, Integer> {
	/*	public  List<Actor>  findByAnameEquals(String aname);
		public Iterable<Actor> findByCategoryIs(String category);
		public Iterable<Actor> findByCategory(String category);
		
		public Iterable<ResultView> findByCategoryEqualsIgnoreCase(String category);
		public ResultView findByMobNo(long mobNo);
		public Actor  findByMobNoIs(long mobNo);
		*/
	
	public <T extends View> Iterable<T>  findByCategoryContainingIgnoreCase(String Letters,Class<T> clazz);
}
