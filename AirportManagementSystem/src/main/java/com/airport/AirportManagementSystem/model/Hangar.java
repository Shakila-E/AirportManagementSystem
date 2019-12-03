package com.airport.AirportManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Hangar")
public class Hangar {

	@Id
	@Column(name = "hangarId", length = 10)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hangarId;
	@Column(name = "managerId", length = 10)
	private int managerId;
	@Column(name = "planeId", length = 10)
	private int planeId;
	@NotEmpty(message="please enter the address")
	@Column(name = "managerAddressLine1", length = 100)
	private String managerAddressLine1;
	@Column(name = "managerAddressLine2", length = 100)
	private String managerAddressLine2;
	@NotEmpty(message="please enter the city")
	@Column(name = "city", length = 50)
	private String city;
	@NotEmpty(message="please enter the state")
	@Column(name = "state", length = 50)
	private String state;
	@NotEmpty(message="please enter the zipCode")
	@Column(name = "zipCode", length = 10)
	private String zipCode;

	public Hangar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hangar(int hangarId, int managerId, String managerAddressLine1, String managerAddressLine2, String city,
			String state, String zipCode) {
		super();
		this.hangarId = hangarId;
		this.managerId = managerId;
		this.managerAddressLine1 = managerAddressLine1;
		this.managerAddressLine2 = managerAddressLine2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
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

	public String getManagerAddressLine1() {
		return managerAddressLine1;
	}

	public void setManagerAddressLine1(String managerAddressLine1) {
		this.managerAddressLine1 = managerAddressLine1;
	}

	public String getManagerAddressLine2() {
		return managerAddressLine2;
	}

	public void setManagerAddressLine2(String managerAddressLine2) {
		this.managerAddressLine2 = managerAddressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
