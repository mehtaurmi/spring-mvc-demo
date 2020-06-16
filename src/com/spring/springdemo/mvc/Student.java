package com.spring.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryCode;
	private String favLanguage;
	private String operatingSystem;
	
	public Student() {
		
		countryCode= new LinkedHashMap<>();
		countryCode.put("BR", "Brazil");
		countryCode.put("FR", "France");
		countryCode.put("CA", "Canada");
		countryCode.put("IN", "India");
		countryCode.put("US", "United States of America");
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(LinkedHashMap<String, String> countryCode) {
		this.countryCode = countryCode;
	}

	public String getFavLanguage() {
		return favLanguage;
	}

	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	

}
