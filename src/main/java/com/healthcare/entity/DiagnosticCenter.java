package com.healthcare.entity;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="DIAGNOSTIC_CENTER")
public class DiagnosticCenter
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="center_id")
	private int centerId;
	@Column(name="center_name")
	private String centerName;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<User> userList;
	
	
	@OneToMany(mappedBy="diagnosticCenter", cascade = CascadeType.ALL)
	private List<Test> testList=new ArrayList<>();
	
	@OneToMany(mappedBy="diagnosticCenter")
	private List<Appointment> appointmentList=new ArrayList<>();

	public DiagnosticCenter() {
		super();
	}

	public DiagnosticCenter(int centerId, String centerName, List<User> userList, List<Test> testList,
			List<Appointment> appointmentList) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
		this.userList = userList;
		this.testList = testList;
		this.appointmentList = appointmentList;
	}

	public int getCenterId() {
		return centerId;
	}

	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public List<User> getUser() {
		return userList;
	}

	public void setUser(List<User> userList) {
		this.userList = userList;
	}

	public List<Test> getTestList() {
		return testList;
	}

	public void setTestList(List<Test> testList) {
		this.testList = testList;
	}

	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}
	
}