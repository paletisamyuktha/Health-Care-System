package com.healthcare.entity;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="APPOINTMENTS")
public class Appointment
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appointmentId;
	private boolean approved;
	private LocalDateTime dateTime;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(mappedBy="appointment",cascade=CascadeType.ALL)
	@JsonIgnore
	private List<Test> testList = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="center_id")
	private DiagnosticCenter diagnosticCenter;

	public Appointment() {
		super();
	}

	public Appointment(int appointmentId, boolean approved, LocalDateTime dateTime, User user, List<Test> testList,
			DiagnosticCenter diagnosticCenter) {
		super();
		this.appointmentId = appointmentId;
		this.approved = approved;
		this.dateTime = dateTime;
		this.user = user;
		this.testList = testList;
		this.diagnosticCenter = diagnosticCenter;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Test> getTestList() {
		return testList;
	}

	public void setTestList(List<Test> testList) {
		this.testList = testList;
	}

	public DiagnosticCenter getDiagnosticCenter() {
		return diagnosticCenter;
	}

	public void setDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}
	
}
