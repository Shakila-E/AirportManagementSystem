package com.airport.AirportManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Manager")
public class Manager {

	@Id
	@Column(name = "managerId", length = 10)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int managerId;
	@NotEmpty(message = "firstName cannot be empty")
	@Column(name = "firstName", length = 50)
	private String firstName;
	@NotEmpty(message = "lastName cannot be empty")
	@Column(name = "lastName", length = 50)
	private String lastName;
	@NotEmpty(message = "age cannot be empty")
	@Column(name = "age", length = 2)
	private int age;
	@NotEmpty(message = "gender cannot be empty")
	@Column(name = "gender", length = 10)
	private String gender;
	@NotEmpty(message = "please enter the dob")
	@Column(name = "dob", length = 10)
	private String dob;
	@NotEmpty(message = "Contact Number cannot be empty")
	@Column(name = "contactNumber", length = 10)
	private String contactNumber;
	@NotEmpty(message = "please enter the alternate Contact Number")
	@Column(name = "altContactNumber", length = 10)
	private String altContactNumber;
	@NotEmpty(message = "Emailid cannot be empty")
	@Column(name = "emailId", length = 50)
	private String emailId;
	@Size(min = 5, message = "Min 5 chars required")
	@Column(name = "password", length = 15)
	private String password;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int managerId, @NotEmpty(message = "firstName cannot be empty") String firstName,
			@NotEmpty(message = "lastName cannot be empty") String lastName,
			@NotEmpty(message = "age cannot be empty") int age,
			@NotEmpty(message = "gender cannot be empty") String gender,
			@NotEmpty(message = "please enter the dob") String dob,
			@NotEmpty(message = "Contact Number cannot be empty") String contactNumber,
			@NotEmpty(message = "please enter the alternate Contact Number") String altContactNumber,
			@NotEmpty(message = "Emailid cannot be empty") String emailId,
			@Size(min = 5, message = "Min 5 chars required") String password) {
		super();
		this.managerId = managerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
		this.contactNumber = contactNumber;
		this.altContactNumber = altContactNumber;
		this.emailId = emailId;
		this.password = password;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAltContactNumber() {
		return altContactNumber;
	}

	public void setAltContactNumber(String altContactNumber) {
		this.altContactNumber = altContactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
