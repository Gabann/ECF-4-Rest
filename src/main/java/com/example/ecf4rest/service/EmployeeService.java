package com.example.ecf4rest.service;

import com.example.ecf4rest.entity.Employee;
import com.example.ecf4rest.util.DaoUtils;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class EmployeeService
{
	public List<Employee> getAllEmployee()
	{
		return DaoUtils.getEmployeeDao().getAll();
	}

	public void saveEmployee(Employee employee)
	{
		DaoUtils.getEmployeeDao().saveOrUpdate(employee);
	}

	public Employee getById(Long id)
	{
		return DaoUtils.getEmployeeDao().getById(id);
	}

	public void deletebyId(Long id)
	{
		DaoUtils.getEmployeeDao().deleteById(id);
	}

	public void updateEmployee(Employee employee)
	{
		DaoUtils.getEmployeeDao().saveOrUpdate(employee);
	}

	public List<Employee> getByDepartment(String department)
	{
		return DaoUtils.getEmployeeDao().getAll()
				.stream()
				.filter(employee -> employee.getDepartment().equals(department))
				.toList();
	}

	public List<Employee> getByFirstName(String firstName)
	{
		return DaoUtils.getEmployeeDao().getAll()
				.stream()
				.filter(employee -> employee.getFirstName().equals(firstName))
				.toList();
	}

	public List<Employee> getByLastName(String lastName)
	{
		return DaoUtils.getEmployeeDao().getAll()
				.stream()
				.filter(employee -> employee.getLastName().equals(lastName))
				.toList();
	}
}
