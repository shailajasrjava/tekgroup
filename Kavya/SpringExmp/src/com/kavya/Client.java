package com.kavya;

import java.io.Serializable;


public class Client implements Serializable {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String Id;
    
	private String firstname;
    
	private String lastname;
    
	private String email;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

