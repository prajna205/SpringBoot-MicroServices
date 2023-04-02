package com.nt.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AlertServiceRunner implements CommandLineRunner {

	public AlertServiceRunner() {
		System.out.println("AlertServiceRunner::0-param constructor");
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("AlertServiceRunner.run()");
		System.out.println("cmd line args are::");
		for(String arg:args) {
			System.out.println(arg);
		}
	}
}
