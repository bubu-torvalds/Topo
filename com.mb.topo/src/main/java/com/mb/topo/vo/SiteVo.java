package com.mb.topo.vo;

import java.util.List;

public class SiteVo {

	private String name;

	private String country;

	private List<BoulderVo> boulders;

	private List<RouteVo> routes;

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

	public List<BoulderVo> getBoulders() {
		return boulders;
	}

	public void setBoulders(List<BoulderVo> boulders) {
		this.boulders = boulders;
	}

	public List<RouteVo> getRoutes() {
		return routes;
	}

	public void setRoutes(List<RouteVo> routes) {
		this.routes = routes;
	}

}
