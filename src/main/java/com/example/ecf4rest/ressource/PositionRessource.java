package com.example.ecf4rest.ressource;

import com.example.ecf4rest.entity.Position;
import com.example.ecf4rest.service.PositionService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/position")
public class PositionRessource
{
	private final PositionService positionService;

	@Inject
	public PositionRessource(PositionService positionService)
	{
		this.positionService = positionService;
	}

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Position> getAll()
	{
		return positionService.getAllPosition();
	}

	@GET
	@Path("/id/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Position getById(@PathParam("id") Long id)
	{
		return positionService.getById(id);
	}


	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	public void save(Position position)
	{
		positionService.savePosition(position);
	}

	@POST
	@Path("/delete/{id}")
	public void deleteById(@PathParam("id") Long id)
	{
		positionService.deleteById(id);
	}

	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(Position position)
	{
		positionService.updatePosition(position);
	}
}
