package com.cg.pojo;

public class Person {

	private String firstName;
	private String lastName;
	private String gender;
	private String highestQualification;
	private String dateOfBirth;
	private String[] hobbies;
	private String address;
	private String[] skills;
	private String email;
	private String website;
	private String contactNumber;
	private String description;

	
	public Person(String firstName, String lastName, String gender, String highestQualification, String dateOfBirth,
			String[] hobbies, String address, String[] skills, String email, String website, String contactNumber,
			String description) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.highestQualification = highestQualification;
		this.dateOfBirth = dateOfBirth;
		this.hobbies = hobbies;
		this.address = address;
		this.skills = skills;
		this.email = email;
		this.website = website;
		this.contactNumber = contactNumber;
		this.description = description;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getGender() {
		return gender;
	}


	public String getHighestQualification() {
		return highestQualification;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public String[] getHobbies() {
		return hobbies;
	}


	public String getAddress() {
		return address;
	}


	public String[] getSkills() {
		return skills;
	}


	public String getEmail() {
		return email;
	}


	public String getWebsite() {
		return website;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public String getDescription() {
		return description;
	}
	
	
	
}
