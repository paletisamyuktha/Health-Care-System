package com.healthcare.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="USERS")
public class User
{
	@Id
	@Column(name="user_id")
	private int userId;
	@Column(name="user_name")
	private String userName;
	@Column(name="contact_no")
	private String contactNo;
	@Column(name="user_email")
	private String userEmail;
	@Column(name="gender")
	private String gender;
	@Column(name="age")
	private String age;
	
	@OneToOne(mappedBy = "user",cascade=CascadeType.ALL)
	@JoinColumn(name="appointment_id")
	private Appointment appointment;
	
	@ManyToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="center_id")
	private DiagnosticCenter diagnosticCenter;

	public User() 
	{
		super();
	}

	public User(int userId, String userName, String contactNo, String userEmail, String gender, String age,
			Appointment appointment, DiagnosticCenter diagnosticCenter) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.contactNo = contactNo;
		this.userEmail = userEmail;
		this.gender = gender;
		this.age = age;
		this.appointment = appointment;
		this.diagnosticCenter = diagnosticCenter;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public DiagnosticCenter getDiagnosticCenterList() {
		return diagnosticCenter;
	}

	public void setDiagnosticCenterList(DiagnosticCenter diagnosticCenterList) {
		this.diagnosticCenter = diagnosticCenterList;
	}
}