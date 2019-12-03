package com.airport.AirportManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Pilots")
public class Pilot {

	@Id
	@Column(name = "pilotId", length = 10)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pilotId;
	@Column(name = "planeId", length = 10)
	private int planeId;
	@NotEmpty(message="please enter the license Number")
	@Column(name = "licenseNumber", length = 50)
	private String licenseNumber;
	@NotEmpty(message="please enter the address")
	@Column(name = "addressLine1", length = 100)
	private String addressLine1;
	@Column(name = "addressLine2", length = 100)
	private String addressLine2;
	@NotEmpty(message="city cannot be empty")
	@Column(name = "city", length = 50)
	private String city;
	@NotEmpty(message="state cannot be empty")
	@Column(name = "state", length = 50)
	private String state;
	@NotEmpty(message="zipcode cannot be empty")
	@Column(name = "zipCode", length = 10)
	private String zipCode;
	@NotEmpty(message="ssn cannot be empty")
	@Column(name = "ssn", length = 50)
	private int ssn;

	public Pilot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pilot(int pilotId, String licenseNumber, String addressLine1, String addressLine2, String city,
			String state, String zipCode, int ssn) {
		super();
		this.pilotId = pilotId;
		this.licenseNumber = licenseNumber;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.ssn = ssn;
	}

	public int getPilotId() {
		return pilotId;
	}

	public void setPilotId(int pilotId) {
		this.pilotId = pilotId;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

}
