package com.mb.topo.dto;

import java.util.List;

public class ClimberDto {
	
	private long id;
	
	private String userName;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private List<BoulderDto> boulderDone;
	
	private List<RouteDto> routeDone;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public List<BoulderDto> getBoulderDone() {
		return boulderDone;
	}

	public void setBoulderDone(List<BoulderDto> boulderDone) {
		this.boulderDone = boulderDone;
	}

	public List<RouteDto> getRouteDone() {
		return routeDone;
	}

	public void setRouteDone(List<RouteDto> routeDone) {
		this.routeDone = routeDone;
	}

}
