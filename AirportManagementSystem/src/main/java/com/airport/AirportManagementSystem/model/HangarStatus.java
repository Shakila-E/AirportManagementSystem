package com.airport.AirportManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "HangarStatus")
public class HangarStatus {

	@Id
	@Column(name = "hangarId", length = 10)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hangarId;
	@Column(name = "managerId", length = 10)
	private int managerId;
	@NotEmpty(message="please enter the status of the hangar")
	@Column(name = "status", length = 50)
	private String status;
	@NotEmpty(message="please enter the date")
	@Column(name = "occupancyFromDate", length = 20)
	private String occupancyFromDate;
	@NotEmpty(message="please enter the date")
	@Column(name = "occupancyTillDate", length = 20)
	private String occupancyTillDate;
	@NotEmpty(message="please enter the date")
	@Column(name = "availableFromDate", length = 20)
	private String availableFromDate;
	@NotEmpty(message="please enter the date")
	@Column(name = "availableTillDate ", length = 20)
	private String availableTillDate;

	public HangarStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HangarStatus(int hangarId, int managerId, String status, String occupancyFromDate, String occupancyTillDate,
			String availableFromDate, String availableTillDate) {
		super();
		this.hangarId = hangarId;
		this.managerId = managerId;
		this.status = status;
		this.occupancyFromDate = occupancyFromDate;
		this.occupancyTillDate = occupancyTillDate;
		this.availableFromDate = availableFromDate;
		this.availableTillDate = availableTillDate;
	}

	public int getHangarId() {
		return hangarId;
	}

	public void setHangarId(int hangarId) {
		this.hangarId = hangarId;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOccupancyFromDate() {
		return occupancyFromDate;
	}

	public void setOccupancyFromDate(String occupancyFromDate) {
		this.occupancyFromDate = occupancyFromDate;
	}

	public String getOccupancyTillDate() {
		return occupancyTillDate;
	}

	public void setOccupancyTillDate(String occupancyTillDate) {
		this.occupancyTillDate = occupancyTillDate;
	}

	public String getAvailableFromDate() {
		return availableFromDate;
	}

	public void setAvailableFromDate(String availableFromDate) {
		this.availableFromDate = availableFromDate;
	}

	public String getAvailableTillDate() {
		return availableTillDate;
	}

	public void setAvailableTillDate(String availableTillDate) {
		this.availableTillDate = availableTillDate;
	}

}
