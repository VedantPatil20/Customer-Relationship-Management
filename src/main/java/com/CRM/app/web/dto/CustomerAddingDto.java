package com.CRM.app.web.dto;

public class CustomerAddingDto {
	
	private String firstName;
	private String lastName;
	private String email;
	private Long contact;
	
	public CustomerAddingDto() {
		
	}

	public CustomerAddingDto(String firstName, String lastName, String email, Long contact) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}
	
}
