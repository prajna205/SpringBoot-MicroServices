package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("deng")
public class DisealEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("DisealEngine.start()");
	}

	@Override
	public void stop() {
		System.out.println("DisealEngine.stop()");
	}

}
