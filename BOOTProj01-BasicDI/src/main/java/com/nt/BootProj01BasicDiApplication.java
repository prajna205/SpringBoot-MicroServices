package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessageGenerator;

@SpringBootApplication
public class BootProj01BasicDiApplication {
	
	//pre-defined class as spring bean
	@Bean(name = "ldt")
	public LocalDateTime createLDT() {
		System.out.println("BootProj01BasicDi1Application.createLDT()");
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx =SpringApplication.run(BootProj01BasicDiApplication.class, args);
		//get target spring bean class obj ref
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke b.method
		String result=generator.showWishMessage("Prajna");
		System.out.println(result);
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
