package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Hotel;

@SpringBootApplication
public class BootProj04ValueAnnotationSpelApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj04ValueAnnotationSpelApplication.class, args);
		//get hotel object ref
		Hotel hotel=ctx.getBean("hotel",Hotel.class);
		System.out.println(hotel);
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
