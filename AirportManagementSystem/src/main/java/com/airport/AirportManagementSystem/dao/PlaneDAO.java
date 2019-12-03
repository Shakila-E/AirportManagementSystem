package com.airport.AirportManagementSystem.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airport.AirportManagementSystem.model.Plane;


@Repository
public interface PlaneDAO extends CrudRepository<Plane, Integer> {
	public Plane findByPlaneId(int planeId);

	public List<Plane> findAll();
}
