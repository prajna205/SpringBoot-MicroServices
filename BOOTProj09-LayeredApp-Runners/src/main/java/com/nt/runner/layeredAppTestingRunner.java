package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.PayrollOperationsController;
import com.nt.model.Employee;

@Component
public class layeredAppTestingRunner implements CommandLineRunner {
	@Autowired
	private PayrollOperationsController controller;
	public layeredAppTestingRunner() {
		System.out.println("layeredAppTestingRunner.layeredAppTestingRunner()");
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("layeredAppTestingRunner.run()");
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
	}

}
