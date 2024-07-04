package com.example.ecf4rest.util;

import com.example.ecf4rest.dao.EmployeeDao;
import com.example.ecf4rest.dao.GenericDao;
import com.example.ecf4rest.entity.Department;
import com.example.ecf4rest.entity.Position;

public final class DaoUtils
{
	private static EmployeeDao employeeDao;
	private static GenericDao<Department> departmentDao;
	private static GenericDao<Position> positionDao;

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

	public static GenericDao<Department> getDepartmentDao()
	{
		if (departmentDao == null)
		{
			departmentDao = new GenericDao<>(HibernateUtil.getSessionFactory(), Department.class);
		}
		return departmentDao;
	}

	public static GenericDao<Position> getPositionDao()
	{
		if (positionDao == null)
		{
			positionDao = new GenericDao<>(HibernateUtil.getSessionFactory(), Position.class);
		}
		return positionDao;
	}
}
