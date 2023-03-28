package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("peng")
public class PetrolEngine implements IEngine {
	
	@Override
	public void start() {
		System.out.println("PetrolEngine.start()");
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop()");
	}

}
