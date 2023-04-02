package com.nt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.controller.PayrollOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj08LayeredApplication {

	@Autowired
	private Environment env;
	@Bean("c3p0DS")
	@Profile("test")
	public  ComboPooledDataSource createC3P0DS() throws Exception {
		System.out.println("BootProj08LayeredApplication.createC3P0DS()");
		ComboPooledDataSource cpds=new ComboPooledDataSource();
		cpds.setDriverClass(env.getRequiredProperty("spring.datasource.driver-class-name"));
		cpds.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
		cpds.setUser(env.getRequiredProperty("spring.datasource.username"));
		cpds.setPassword(env.getRequiredProperty("spring.datasource.password"));
			return cpds;
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj08LayeredApplication.class, args);
		//get controller class obj
		PayrollOperationsController controller = ctx.getBean("payroll",PayrollOperationsController.class);
		//invoke b.method
		try {
			List<Employee> list=controller.showEmployeeByDesgs("ANALYST", "MANAGER", "SALES");
			list.forEach(emp->{
				System.out.println(emp);
			});
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Internal problem ..Try again");
		}
		//close IOC container
		((ConfigurableApplicationContext) ctx).close();
	}
}
