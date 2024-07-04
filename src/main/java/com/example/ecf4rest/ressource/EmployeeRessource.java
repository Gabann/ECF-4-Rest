package com.example.ecf4rest.ressource;

import com.example.ecf4rest.entity.Employee;
import com.example.ecf4rest.service.EmployeeService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/employee")
public class EmployeeRessource
{
	private final EmployeeService employeeService;

	@Inject
	public EmployeeRessource(EmployeeService employeeService)
	{
		this.employeeService = employeeService;
	}

	@GET
	@Path("/id/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getById(@PathParam("id") Long id)
	{
		return employeeService.getById(id);
	}

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAll()
	{
		return employeeService.getAllEmployee();
	}

	@GET
	@Path("/department/{department}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getByDepartment(@PathParam("department") String department)
	{
		return employeeService.getByDepartment(department);
	}

	@GET
	@Path("/firstName/{firstName}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getByFirstName(@PathParam("firstName") String firstName)
	{
		return employeeService.getByFirstName(firstName);
	}

	@GET
	@Path("/lastName/{lastName}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getByLastName(@PathParam("lastName") String lastName)
	{
		return employeeService.getByLastName(lastName);
	}

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public void save(Employee employee)
	{
		employeeService.saveEmployee(employee);
	}

	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(Employee employee)
	{
		employeeService.updateEmployee(employee);
	}

	@POST
	@Path("/delete/{id}")
	public void deleteById(@PathParam("id") Long id)
	{
		employeeService.deletebyId(id);
	}
}
