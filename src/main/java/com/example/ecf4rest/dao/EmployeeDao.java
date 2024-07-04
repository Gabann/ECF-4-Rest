package com.example.ecf4rest.dao;

import com.example.ecf4rest.entity.Employee;
import org.hibernate.SessionFactory;

public class EmployeeDao extends GenericDao<Employee>
{
	public EmployeeDao(SessionFactory sessionFactory)
	{
		super(sessionFactory, Employee.class);
	}
}
