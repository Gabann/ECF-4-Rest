package com.example.ecf4rest.ressource;

import com.example.ecf4rest.entity.Department;
import com.example.ecf4rest.service.DepartmentService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/department")
public class DepartmentRessource
{
	private final DepartmentService departmentService;

	@Inject
	public DepartmentRessource(DepartmentService departmentService)
	{
		this.departmentService = departmentService;
	}

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Department> getAll()
	{
		return departmentService.getAllDepartment();
	}

	@GET
	@Path("/id/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Department getById(@PathParam("id") Long id)
	{
		return departmentService.getById(id);
	}

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public void save(Department department)
	{
		departmentService.saveDepartment(department);
	}

	@POST
	@Path("/delete/{id}")
	public void deleteById(@PathParam("id") Long id)
	{
		departmentService.deleteById(id);
	}

	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(Department department)
	{
		departmentService.updateDepartment(department);
	}
}
