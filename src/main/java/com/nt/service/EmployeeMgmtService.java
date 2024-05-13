package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.IEmployeeDAO;
import com.nt.model.Employee;
@Service("mgmtservice")
public class EmployeeMgmtService implements IEmployeeMgmtService
{
	@Autowired
private IEmployeeDAO empdao;

	public List<Employee> fetchEmplyeeByDesgs(String desg1, String desg2, String desg3) throws Exception 
	{
		List<Employee> list=empdao.getEmployeesByDesgs(desg1, desg2, desg3);
		
		// TODO Auto-generated method stub
		return list;
	}
	
	
}
