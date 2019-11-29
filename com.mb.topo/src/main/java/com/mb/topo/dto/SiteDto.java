package com.mb.topo.dto;

import java.util.List;

public class SiteDto {

	private long id;

	private String name;

	private String country;

	private List<BoulderDto> boulders;

	private List<RouteDto> routes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<BoulderDto> getBoulders() {
		return boulders;
	}

	public void setBoulders(List<BoulderDto> boulders) {
		this.boulders = boulders;
	}

	public List<RouteDto> getRoutes() {
		return routes;
	}

	public void setRoutes(List<RouteDto> routes) {
		this.routes = routes;
	}

}
