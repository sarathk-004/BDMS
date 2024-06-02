package com.bloodDonationMgmtSystem.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class RequestorDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String requestorName;
	private String requestorPhone;
	private String requestorAge;
	private String requstorSex;
	private String patientName;
	private String patientAge;
	private String locationOfIncident;
	private String criticalityLevel;
	private String patientBloodGroup;
	private String timeLine;
	private String DonarMatchedId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRequestorName() {
		return requestorName;
	}
	public void setRequestorName(String requestorName) {
		this.requestorName = requestorName;
	}
	public String getRequestorPhone() {
		return requestorPhone;
	}
	public void setRequestorPhone(String requestorPhone) {
		this.requestorPhone = requestorPhone;
	}
	public String getRequestorAge() {
		return requestorAge;
	}
	public void setRequestorAge(String requestorAge) {
		this.requestorAge = requestorAge;
	}
	public String getRequstorSex() {
		return requstorSex;
	}
	public void setRequstorSex(String requstorSex) {
		this.requstorSex = requstorSex;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}
	public String getLocationOfIncident() {
		return locationOfIncident;
	}
	public void setLocationOfIncident(String locationOfIncident) {
		this.locationOfIncident = locationOfIncident;
	}
	public String getCriticalityLevel() {
		return criticalityLevel;
	}
	public void setCriticalityLevel(String criticalityLevel) {
		this.criticalityLevel = criticalityLevel;
	}
	public String getPatientBloodGroup() {
		return patientBloodGroup;
	}
	public void setPatientBloodGroup(String patientBloodGroup) {
		this.patientBloodGroup = patientBloodGroup;
	}
	public String getTimeLine() {
		return timeLine;
	}
	public void setTimeLine(String timeLine) {
		this.timeLine = timeLine;
	}
	public String getDonarMatchedId() {
		return DonarMatchedId;
	}
	public void setDonarMatchedId(String donarMatchedId) {
		DonarMatchedId = donarMatchedId;
	}
		
}
