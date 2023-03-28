package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vechile")
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class Vechile {
	@Autowired
//	@Qualifier("deng")
	@Qualifier("enggName")
	private IEngine engine;

	public Vechile() {
		System.out.println("Vechile.Vechile()::0-param constructor");
	}
	
	public void journey(String start, String end) {
		engine.start();
		System.out.println("journey strated at "+start);
		System.out.println("journey is going on..........");
		engine.stop();
		System.out.println("journey ended at "+end);
	}
	
}
