package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eeng")
public class ElectricEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("ElectricEngine.start()");
	}

	@Override
	public void stop() {
		System.out.println("ElectricEngine.stop()");
	}

}
