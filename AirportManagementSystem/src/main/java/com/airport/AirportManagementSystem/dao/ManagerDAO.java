package com.airport.AirportManagementSystem.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airport.AirportManagementSystem.model.Manager;
@Repository
public interface ManagerDAO extends CrudRepository<Manager, Integer>{
	
	public List<Manager> findAll();
	public Manager findByManagerId(int managerId);
	
	
}
