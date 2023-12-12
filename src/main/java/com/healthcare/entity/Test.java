package com.healthcare.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="TESTS")
public class Test
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int testId;
	private String testName;
	
	@ManyToOne
	@JoinColumn(name="center_id")
	@JsonIgnore
	private DiagnosticCenter diagnosticCenter;
	
	
	@ManyToOne
	@JoinColumn(name="appointment_id")
	private Appointment appointment;


	public Test() {
		super();
	}


	public Test(int testId, String testName, DiagnosticCenter diagnosticCenter, Appointment appointment) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.diagnosticCenter = diagnosticCenter;
		this.appointment = appointment;
	}


	public int getTestId() {
		return testId;
	}


	public void setTestId(int testId) {
		this.testId = testId;
	}


	public String getTestName() {
		return testName;
	}


	public void setTestName(String testName) {
		this.testName = testName;
	}


	public DiagnosticCenter getDiagnosticCenter() {
		return diagnosticCenter;
	}


	public void setDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}


	public Appointment getAppointment() {
		return appointment;
	}


	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	
}