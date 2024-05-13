package com.nt;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.PayRollOperationsController;
import com.nt.model.Employee;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BootProj3LayeredApp2
{

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj3LayeredApp2.class, args);
		PayRollOperationsController controller=ctx.getBean("Payroll",PayRollOperationsController.class);
		try
		{
		List<Employee> list=controller.showEmployeeByDesgs("SALESMAN", "CLERK", "MANAGER");
		list.forEach(em->{
		System.out.println(em);});
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}
