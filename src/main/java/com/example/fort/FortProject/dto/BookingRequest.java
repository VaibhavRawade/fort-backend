package com.example.fort.FortProject.dto;

import java.time.LocalDate;

public class BookingRequest {

    private String fullName;
    private String email;
    private String phone;

    private String fortId;          // from frontend (f.id)
    private Integer numberOfPeople;

    private String packageType;     // basic / standard / premium
    private LocalDate travelDate;

    private String specialRequests;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFortId() {
		return fortId;
	}

	public void setFortId(String fortId) {
		this.fortId = fortId;
	}

	public Integer getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(Integer numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public String getPackageType() {
		return packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public LocalDate getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	public String getSpecialRequests() {
		return specialRequests;
	}

	public void setSpecialRequests(String specialRequests) {
		this.specialRequests = specialRequests;
	}
    
    
}