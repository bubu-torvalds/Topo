package com.mb.topo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Climber {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	private String userName;

	@NotNull
	private String firstName;

	@NotNull
	private String lastName;

	@NotNull
	private String password;

	@NotNull
	private String email;

	@ManyToMany
	@JoinTable(name = "BOULDER_DONE", joinColumns = @JoinColumn(name = "CLIMBER_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "BOULDER_ID", referencedColumnName = "ID"))
	private List<Boulder> bouldersDone;

	@ManyToMany
	@JoinTable(name = "ROUTE_DONE", joinColumns = @JoinColumn(name = "CLIMBER_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ROUTE_ID", referencedColumnName = "ID"))
	private List<Route> routesDone;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Boulder> getBouldersDone() {
		return bouldersDone;
	}

	public void setBouldersDone(List<Boulder> bouldersDone) {
		this.bouldersDone = bouldersDone;
	}

	public List<Route> getRoutesDone() {
		return routesDone;
	}

	public void setRoutesDone(List<Route> routesDone) {
		this.routesDone = routesDone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Climber other = (Climber) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

}
