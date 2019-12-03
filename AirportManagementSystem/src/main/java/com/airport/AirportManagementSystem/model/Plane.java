package com.airport.AirportManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Planes")
public class Plane {

	@Id
	@Column(name = "planeId", length = 10)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int planeId;
	@Column(name = "ownerId", length = 10)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ownerId;
	@NotEmpty(message="FirstName cannot be empty")
	@Column(name = "ownerFirstName", length = 50)
	private String ownerFirstName;
	@NotEmpty(message="LastName cannot be empty")
	@Column(name = "ownerLastName", length = 50)
	private String ownerLastName;
	@NotEmpty(message="ContactNumber cannot be empty")
	@Column(name = "ownerContactNumber", length = 10)
	private String ownerContactNumber;
	@NotEmpty(message="Email cannot be empty")
	@Column(name = "ownerEmail", length = 50)
	private String ownerEmail;
	@NotEmpty(message="Type of plane cannot be empty")
	@Column(name = "planeType", length = 50)
	private String planeType;
	@NotEmpty(message="please enter the capacity of the plane")
	@Column(name = "planeCapacity", length = 50)
	private int planeCapacity;
	@Id
	@Column(name = "hangarId", length = 10)
	private int hangarId;

	public Plane() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Plane(int planeId, int ownerId, @NotEmpty(message = "FirstName cannot be empty") String ownerFirstName,
			@NotEmpty(message = "LastName cannot be empty") String ownerLastName,
			@NotEmpty(message = "ContactNumber cannot be empty") String ownerContactNumber,
			@NotEmpty(message = "Email cannot be empty") String ownerEmail,
			@NotEmpty(message = "Type of plane cannot be empty") String planeType,
			@NotEmpty(message = "please enter the capacity of the plane") int planeCapacity, int hangarId) {
		super();
		this.planeId = planeId;
		this.ownerId = ownerId;
		this.ownerFirstName = ownerFirstName;
		this.ownerLastName = ownerLastName;
		this.ownerContactNumber = ownerContactNumber;
		this.ownerEmail = ownerEmail;
		this.planeType = planeType;
		this.planeCapacity = planeCapacity;
		this.hangarId = hangarId;
	}





	public int getHangarId() {
		return hangarId;
	}


	public void setHangarId(int hangarId) {
		this.hangarId = hangarId;
	}


	public int getPlaneId() {
		return planeId;
	}

	public void setPlaneId(int planeId) {
		this.planeId = planeId;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerFirstName() {
		return ownerFirstName;
	}

	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}

	public String getOwnerLastName() {
		return ownerLastName;
	}

	public void setOwnerLastName(String ownerLastName) {
		this.ownerLastName = ownerLastName;
	}

	public String getOwnerContactNumber() {
		return ownerContactNumber;
	}

	public void setOwnerContactNumber(String ownerContactNumber) {
		this.ownerContactNumber = ownerContactNumber;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}


	public int getPlaneCapacity() {
		return planeCapacity;
	}


	public void setPlaneCapacity(int planeCapacity) {
		this.planeCapacity = planeCapacity;
	}

	

}
