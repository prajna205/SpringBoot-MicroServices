package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.PayrollOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj03LayeredApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj03LayeredApplication.class, args);
		//get controller class obj
		PayrollOperationsController controller = ctx.getBean("payroll",PayrollOperationsController.class);
		//invoke b.method
		try {
			List<Employee> list=controller.showEmployeeByDesgs("CLERK", "MANAGER", "SALESMAN");
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
