package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller("payroll")
public class PayrollOperationsController {

	@Autowired
	private IEmployeeMgmtService service;
	
	public PayrollOperationsController() {
		System.out.println("PayrollOperationsController.PayrollOperationsController()");
	}
	
	public List<Employee> showEmployeeByDesgs(String desg1, String desg2, String desg3) throws Exception{
		System.out.println("PayrollOperationsController.showEmployeeByDesgs()");
		//use service
		List<Employee> list= service.fetchEmployesByDesgs(desg1, desg2, desg3);
		return list;
	}
}
