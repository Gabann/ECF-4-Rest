package com.example.ecf4rest.util;

import com.example.ecf4rest.dao.EmployeeDao;

public final class DaoUtils
{
	private static EmployeeDao employeeDao;

	private DaoUtils()
	{
	}

	public static EmployeeDao getEmployeeDao()
	{
		if (employeeDao == null)
		{
			employeeDao = new EmployeeDao(HibernateUtil.getSessionFactory());
		}
		return employeeDao;
	}
}
