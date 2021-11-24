package com.isi.tp2;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDto {
    private Long id;
    private String firstname,lastname,email,password;
    
	public Long getId() {
		return id;
	}
	public UserDto setId(Long id) {
		this.id = id;
		return this;
	}
	public String getFirstname() {
		return firstname;
	}
	public UserDto setFirstname(String firstname) {
		this.firstname = firstname;
		return this;
	}
	public String getLastname() {
		return lastname;
	}
	public UserDto setLastname(String lastname) {
		this.lastname = lastname;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public UserDto setEmail(String email) {
		this.email = email;
		return this;
	}
	
	
	public String getPassword() {
		return password;
	}
	
	@JsonIgnore
	public UserDto setPassword(String password) {
		this.password = password;
		return this;
	}
   
}
