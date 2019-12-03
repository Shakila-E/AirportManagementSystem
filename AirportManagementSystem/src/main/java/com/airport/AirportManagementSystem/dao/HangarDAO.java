package com.airport.AirportManagementSystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.airport.AirportManagementSystem.model.Hangar;
@Repository
public interface HangarDAO extends CrudRepository<Hangar, Integer> {
	public Hangar findByHangarId(int hangarId);
	public List<Hangar> findAll();
	@Query( "FROM Hangar where planeId =:planeId")
	public Hangar findHangarDetailsByPlaneId(@Param("planeId")int planeId);
}
