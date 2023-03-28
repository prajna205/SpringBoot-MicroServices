package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vechile;

@SpringBootApplication
public class BootProj02DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj02DependencyInjectionApplication.class, args);
	//get object for target class
		Vechile vec=ctx.getBean("vechile",Vechile.class);
		vec.journey("Bdk", "Hyd");
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
