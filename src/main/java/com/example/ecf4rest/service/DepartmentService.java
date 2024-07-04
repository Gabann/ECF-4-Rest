package com.example.ecf4rest.service;

import com.example.ecf4rest.entity.Department;
import com.example.ecf4rest.util.DaoUtils;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class DepartmentService
{
	public List<Department> getAllDepartment()
	{
		return DaoUtils.getDepartmentDao().getAll();
	}

	public void saveDepartment(Department department)
	{
		DaoUtils.getDepartmentDao().saveOrUpdate(department);
	}

	public Department getById(Long id)
	{
		return DaoUtils.getDepartmentDao().getById(id);
	}

	public void deleteById(Long id)
	{
		DaoUtils.getDepartmentDao().deleteById(id);
	}

	public void updateDepartment(Department department)
	{
		DaoUtils.getDepartmentDao().saveOrUpdate(department);
	}
}
