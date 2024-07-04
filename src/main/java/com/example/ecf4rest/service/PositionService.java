package com.example.ecf4rest.service;

import com.example.ecf4rest.entity.Position;
import com.example.ecf4rest.util.DaoUtils;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class PositionService
{
	public List<Position> getAllPosition()
	{
		return DaoUtils.getPositionDao().getAll();
	}

	public void savePosition(Position position)
	{
		DaoUtils.getPositionDao().saveOrUpdate(position);
	}

	public Position getById(Long id)
	{
		return DaoUtils.getPositionDao().getById(id);
	}

	public void deleteById(Long id)
	{
		DaoUtils.getPositionDao().deleteById(id);
	}

	public void updatePosition(Position position)
	{
		DaoUtils.getPositionDao().saveOrUpdate(position);
	}
}
