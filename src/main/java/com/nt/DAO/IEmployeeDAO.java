package com.nt.DAO;

import java.util.List;

import com.nt.model.Employee;

/**
 *
 *
 *
 * ksdfsdklf
 */
public interface IEmployeeDAO
{
	public List<Employee> getEmployeesByDesgs(String desg1,String desg2,String desg3) throws Exception;
}
