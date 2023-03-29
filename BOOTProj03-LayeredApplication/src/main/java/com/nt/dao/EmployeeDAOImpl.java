package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMPS_BY_DESGS = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN (?,?,?) ORDER BY JOB";

	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeDAOImpl.getEmployeesByDesgs():: ds class name::" + ds.getClass());
		List<Employee> list = null;
      //get pooled con obj
		try (Connection con = ds.getConnection(); 
				PreparedStatement ps = con.prepareStatement(GET_EMPS_BY_DESGS)) {
			// set the values to query param
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			try (ResultSet rs = ps.executeQuery()) {
				list = new ArrayList<Employee>();
				while (rs.next()) {
					// copy each record to RS to employee obj
					Employee emp = new Employee();
					emp.setEno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setDesg(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));
					// add employee object to list collection
					list.add(emp);
				}//while
			}//try-rs
		}//try-con
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}//catch
		return list;
	}
}
